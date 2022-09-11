package com.greatlearning.springMvcdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Controller

public class DemoController {

	// This will be Returning The First Student page :-
	@RequestMapping("/")
	public String Main_Controller(){
		return "Main-Menu";
	}
}
