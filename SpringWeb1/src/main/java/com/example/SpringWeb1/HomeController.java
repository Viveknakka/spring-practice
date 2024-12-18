package com.example.SpringWeb1;

import org.springframework.ui.Model;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(){
        System.out.println("homepage..");
        return "index";
    }
//    @RequestMapping("/add")
//    public  String add(HttpServletRequest req, HttpSession session){
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        System.out.println("in add.."+(num1+num2));;
//        int result=num1+num2;
//        session.setAttribute("result",result);
//        return "result.jsp";
//    }
//@RequestMapping("/add")
//public String add(@RequestParam("num1") int num, int num2, Model model){
//       // session.setAttribute("result",num+num2);
//     model.addAttribute("result",(num+num2));
//        return "result";
//}
@RequestMapping("/add")
public ModelAndView add(@RequestParam("num1") int num, int num2, ModelAndView mv){
    // session.setAttribute("result",num+num2);
    int result = num+num2;
    mv.addObject("result",result);
    mv.setViewName("result");
    return mv;
}
//@RequestMapping("/addAllien")
//public ModelAndView addAllien(@RequestParam("aid") int aid,String aname,ModelAndView mv){
//        String result=aid+" "+aname;
//        Allien obj = new Allien();
//        obj.setAid(aid);
//        obj.setAname(aname);
//       mv.addObject("allien",obj);
//       mv.setViewName("result");
//        return mv;
//}
    @ModelAttribute("course")
    public String getCourse(){
        return "Java";
    }
    @RequestMapping("/addAllien")
    public String addAllien(@ModelAttribute("allien1") Allien allien){//ModelAtrribute can be optional
        return "result";
    }


}
