package com.example.SpringBootWeb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.SpringBootWeb.Model.Student;
import com.example.SpringBootWeb.dao.StudentDao;


@Controller
public class HomeController {
	
	@Autowired
	StudentDao studentDao;
	ModelAndView model;
	@RequestMapping("/home")
	public String getHome(Model model){
		
		model.addAttribute("student", new Student());
		return "register";
	}

	@RequestMapping("/register")
	public String getRegister(@ModelAttribute("student")Student std ){
		studentDao.saveStudent(std);
		model = new ModelAndView("detailes");
		model.addObject("student", studentDao.saveStudent(std));
		return "detailes";
	}
	
	@RequestMapping("/getAll")
	public String getAll(){
		List<Student> list = studentDao.getStudent();
		model = new ModelAndView("detailes");
		model.addObject("student", list);
		return "details";
		
	}
}
