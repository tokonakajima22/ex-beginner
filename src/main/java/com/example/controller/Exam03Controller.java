package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
	
	@Autowired
	public ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@RequestMapping ("/result")
	public String result(Integer item1, Integer item2, Integer item3) {
		int total = item1 + item2 + item3;
		application.setAttribute("taxExcluded", total);
		application.setAttribute("taxExcluded", total * 1.1);
		return "exam03-result";
		
	}

}
