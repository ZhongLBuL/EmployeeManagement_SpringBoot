package com.mycode.springboot.employeemanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/loginPage")
	public String showLoginPage() {
		
		return "login";
		
	}
	
	// add request mapping for /access-denied
	
	@GetMapping("/noAccess")
	public String getAccessDenied() {
		
		return "access-denied";
		
	}
}
