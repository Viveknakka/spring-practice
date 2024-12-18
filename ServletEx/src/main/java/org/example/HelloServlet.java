package org.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    public  void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("in serviec");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Hello world</h1>");
        ;

    }

}
