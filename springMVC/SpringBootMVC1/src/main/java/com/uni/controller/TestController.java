package com.uni.controller;

import java.util.Map;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@RequestMapping(value ="/",method=RequestMethod.GET)
	public String showReport(Map<String,Object> model) {
		String msg="hello mahindra";
		System.out.println(model.getClass().getName());
		model.put("msg",msg);
		return "home";
	}
	@RequestMapping(value ="/report",method=RequestMethod.GET)
	public String showR1(Map<String,Object> model) {
		String msg="hello reddy";
		System.out.println(model.getClass().getName());
		model.put("msg",msg);
		return "home";
	}
	@RequestMapping(value ="/Report",method=RequestMethod.GET)
	public String showR2(Map<String,Object> model) {
		String msg="hello mahi";
		System.out.println(model.getClass().getName());
		model.put("msg",msg);
		return "home";
	}

}