package com.farm.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.farm.dao.Credential;

import com.farm.dao.Status;

import com.farm.service.LoginService;

@Controller
public class LoginController {
	

	@Autowired
	private LoginService loginService;
	

	@RequestMapping("/login.lti")
	public String loginValidation(@ModelAttribute("login") Credential credentials) {
		String obj = loginService.login(credentials.getEmail(), credentials.getPassword(), credentials.getRole());
		return obj;
	}



}
