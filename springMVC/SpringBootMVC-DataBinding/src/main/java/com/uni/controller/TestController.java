package com.uni.controller;

import java.util.Map;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uni.model.Employee;

import jakarta.annotation.PostConstruct;

@Controller
public class TestController {
	
	@GetMapping("/result")
	public String home(Map<String,Object> model) {
		model.put("name", "universIn");
		return "home";
	}
	
	@PostMapping("/result")
	public String result(Map<String,Object> model,@ModelAttribute("emp") Employee emp) {
		System.out.println(emp);
		
		return "result";
		
	}
	

}
