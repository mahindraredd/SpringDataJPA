package com.uni.controller;

import java.util.Map;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.uni.model.Employee;

import jakarta.annotation.PostConstruct;

@Controller
public class TestController {
	
//	@GetMapping("/")
//	public String home(@ModelAttribute("emp")Employee emp,Map<String,Object> model) {
//		model.put("name", "universIn");
//		System.out.println(emp.getEname());
//		System.out.println(emp);
//		return "home";
//	}
//	
//	@PostMapping("/result")
//	public String result(Map<String,Object> model,@ModelAttribute("emp") Employee emp) {
//		System.out.println(emp);
//		
//		return "result";
//		
//	}
	
	@GetMapping("/index")
	public String index(Map<String,Object> model,@RequestParam("sno") Integer sno,@RequestParam("name") String name) {
		model.put("name", name);
		model.put("sno",sno);
		return "index";
	}
	
	@PostMapping("/data")
	public String data(Map<String,Object> model,@RequestParam("sno") Integer sno,@RequestParam("name") String name) {
		model.put("name", name);
		model.put("sno",sno);
		
		
		return "data";
	}
	

}