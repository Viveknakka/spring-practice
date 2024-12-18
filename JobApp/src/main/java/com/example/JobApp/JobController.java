package com.example.JobApp;


import com.example.JobApp.model.JobPost;
import com.example.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JobController {
    @Autowired
    private JobService service;
    @RequestMapping({"/","home"})
    public  String home(){
        System.out.println("home...");
        return "home";
    }
    @RequestMapping("/addjob")
    public  String addJob( @ModelAttribute  JobPost jobPost){
        System.out.println("addjob....");
        System.out.println("control+"+jobPost);
        service.addJob(jobPost);
        return "addjob";
    }
    @GetMapping("/viewalljobs")
    public String viewAllJobs(Model model){
        System.out.println("viewall...");
        List<JobPost>jobPosts=service.getAllJobs();
        model.addAttribute("jobPosts",jobPosts);
        return "viewalljobs";
    }
   @PostMapping("handleForm")
    public  String handleForm(JobPost jobPost ){
        return "success";
   }




}
