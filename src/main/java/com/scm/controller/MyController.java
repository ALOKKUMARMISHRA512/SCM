package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("This is home page handlar");
        model.addAttribute("name", "Substring Techologies");
        model.addAttribute("Youtube", "Learn Code With Kishan");
        model.addAttribute("githubRepo", "https://github.com/ALOKKUMARMISHRA512/");
        return "home";
    }

    @RequestMapping("/about")
    public String about(Model model){
        System.out.println("About page loading...");
        model.addAttribute("isLogin", true);
        return "about";
    }


    @RequestMapping("/services")
    public String servicesPage(){
        System.out.println("services page loading...");
        return "services";
    }

}
