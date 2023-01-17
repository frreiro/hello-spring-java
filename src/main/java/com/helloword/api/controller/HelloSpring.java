package com.helloword.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloSpring {
	
	@GetMapping
	public String helloSpring(){
		return "Olá Spring";
	}
}
