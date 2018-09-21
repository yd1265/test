package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(Model model){
		String message="I am just testing to see if it will work with heroku";
		model.addAttribute("message", message);
		return "index";
	}
}
