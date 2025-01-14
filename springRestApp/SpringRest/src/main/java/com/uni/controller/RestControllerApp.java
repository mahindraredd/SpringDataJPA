package com.uni.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestControllerApp {
	@GetMapping("/greet")
	public ResponseEntity<String> display(){
		System.out.println("entered");
		return new ResponseEntity<String>("Good Day",HttpStatus.OK);
	}
}
