package com.greatlearning.springMvcdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.springMvcdemo.Student_Details;

import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Controller
@RequestMapping("/student_Details")
public class Student_Controller {
	
	@RequestMapping("/showForm")
	public String ShowStudent( Model TheModel) {
		
		//Now Creating An Object Of the Student Hear :-
		Student_Details theStudent=new Student_Details();
		TheModel.addAttribute("student", theStudent);
		return "Student_form";
	}
		
	@RequestMapping("/prossess")
	public String ConformStudent(@ModelAttribute("student") Student_Details theStudent) {
		
		System.out.println("The Student Are :- "+theStudent.getFirst_Name()+theStudent.getLast_Name());
		return "Student_Conformetion";
		
	}		
}


