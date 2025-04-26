package com.klu;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

@CrossOrigin
public class AppController {
	
	@GetMapping("/mul/{a}/{b}")
	public String add(@PathVariable("a") int a, @PathVariable("b") int b) {
		
		return "mul of two numbers are:"+ (a*b);
	}

}
