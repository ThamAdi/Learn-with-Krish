package com.thamodi.springbootdemo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GreetingController {
	@RequestMapping("/")
	public String greeting() {
		
		return "<h1>It's my first Spring Boot Project .. Welcome!!!</h1>";
	}

}
