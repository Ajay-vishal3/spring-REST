package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HomeController {
	
	
	@RequestMapping("/h1")
	public String getGreeting() {
		return "Good Morning";
	}
	
}
