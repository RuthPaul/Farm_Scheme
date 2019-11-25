package com.farm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.farm.entities.FarmerDetails;
import com.farm.service.FarmerService;

@Controller
public class HelloController {
   

	 
    @RequestMapping("/home")
    public ModelAndView createHome(){
        ModelAndView mv=new ModelAndView("Agrotrade");
        return mv;
    }
    
    @RequestMapping("/farmer_register")
	public ModelAndView farmerRegister(){
        ModelAndView mv=new ModelAndView("farmer_registration");
        return mv;
	}

	@RequestMapping("/bidder_register")
	public ModelAndView bidderRegister(){
        ModelAndView mv=new ModelAndView("bidder_registration");
        return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView loginPage(){
        ModelAndView mv=new ModelAndView("login");
        return mv;
	}
	
	

       
}