package com.example.SpringBootWeb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.SpringBootWeb.Model.Student;


@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String getHome(Model model){
		model.addAttribute("student", new Student());
		return "register";
	}

	@RequestMapping("register")
	public String getRegister(@ModelAttribute("student")Student std ){
		
		return "detailes";
	}
}
