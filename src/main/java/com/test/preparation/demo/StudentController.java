package com.test.preparation.demo;

import org.springframework.beans.factory.annotation.Autowired;

 
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
//@ResponseBody
public class StudentController {
	@Autowired
	//@Qualifier("senior")
	Students st;
	
	@GetMapping(value="/get/{name}")
	public String getName(@PathVariable String name) {
		return "The name is"+name;
	}
	//@ResponseBody
	@GetMapping(value="/gethtml")
	public String view() {
		return "view.html";
	}
	@GetMapping("/getMessage")
	public String message() {
		return st.getMessage();
	}  
	@Autowired
	Students rt;
	@GetMapping("/getMessages")
	public String messages() {
		return rt.getMessage();
	}
	@Value("${defaultName}")
    private String name;
	@GetMapping("/getValue")
	public String Name() {
		return name;
	}
	

}
