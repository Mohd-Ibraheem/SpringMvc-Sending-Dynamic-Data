package com.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home( Model model){
		System.out.println("Start the program");
		
		model.addAttribute("name","Mohammad Ibraheem");
		model.addAttribute("id",121);
		
		List<String> list=new ArrayList();
		Collections.addAll(list, "Kaif","Rehan","Najmul","Uzair");
		Collections.sort(list);
		model.addAttribute("li",list);
		return"home";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is Url home");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name","Mohammad Ibraheem");
		return modelAndView;
	}

}
