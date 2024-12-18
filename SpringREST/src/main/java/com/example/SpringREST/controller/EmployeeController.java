package com.example.SpringREST.controller;

import com.example.SpringREST.model.Employee;
import com.example.SpringREST.repo.EmployeeRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
public class EmployeeController {
@Autowired
    private EmployeeRepo repo;
    @GetMapping("/hello")
    public String sayHello(){
        return "hello Iam saying hello...";
    }
    // Add a new employee
    @PostMapping(value = "/employee", consumes = "multipart/form-data")
    public ResponseEntity<Employee> addEmployee(
            @RequestPart("employee") String employeeJson, // Receive employee as raw JSON string
            @RequestPart("imageFile") MultipartFile imageFile) { // Receive the file

        try {
            // Convert the employee JSON string to an Employee object using ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();
            Employee employee = objectMapper.readValue(employeeJson, Employee.class);

            // Set image details
            employee.setImageName(imageFile.getOriginalFilename());
            employee.setImageType(imageFile.getContentType());
            employee.setImageData(imageFile.getBytes());

            // Save employee to the repository
            Employee savedEmployee = repo.save(employee);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedEmployee); // Return 201 Created
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // Return 500 on error
        }
    }

    // Get all employees
    @GetMapping(value = "/employee",produces = "application/xml")
    public ResponseEntity<List<Employee>> getEmployees() {
//        int a=100/0;
        List<Employee> employees = repo.findAll();
        if (!employees.isEmpty()) {
            return ResponseEntity.ok(employees); // Return 200 OK with the list
        } else {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build(); // Return 204 No Content if list is empty
        }
    }
    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable int id ){
       Employee employee=(Employee) repo.findById(id).orElse(null);
       if(employee!=null){
          return ResponseEntity.ok(employee);
       }else{
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
       }
    }

    @PutMapping("/employee/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int id,@RequestPart Employee employee,@RequestPart MultipartFile imageFile) throws IOException {
        // Check if the employee exists before updating
        employee.setImageName(imageFile.getOriginalFilename());
        employee.setImageType(imageFile.getContentType());
        employee.setImageData(imageFile.getBytes());
        if (repo.existsById(employee.getId())) {
            Employee updatedEmployee = repo.save(employee);
            return ResponseEntity.ok(updatedEmployee); // Return updated employee with 200 OK
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(null); // Return 404 Not Found if employee does not exist
        }
    }


    @DeleteMapping("/employee/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return ResponseEntity.ok("Employee deleted successfully.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found.");
        }
    }




}
