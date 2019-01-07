package com.api2doc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller  
public class UserController {  
      
    @RequestMapping("/index")      
    public ModelAndView index(){        
        ModelAndView view = new ModelAndView("index");     
        view.addObject("id", System.currentTimeMillis());     
        return view;      
    }   
}  
