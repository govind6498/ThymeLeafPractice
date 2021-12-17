package com.govind.thymeleafpractcics.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value="/about",method=RequestMethod.GET)
	public String about(Model model) {
		System.out.println("Inside about Handler");
		model.addAttribute("Name","Govind Singh");
		model.addAttribute("CurrentDate",new Date().toLocaleString());
		return "about";  //about.html
	}
	@GetMapping("/example-loop")
	public String iterateHandler(Model m) {
		String[] strArray= {"Ankita","Laxmi","Govind","Karan","Anlit","John"};
		
		List<String>names = Arrays.asList(strArray);
		m.addAttribute("names",names);
		return "iterate";
	}
}