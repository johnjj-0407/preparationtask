package com.test.preparation.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
	@GetMapping(value="/getname/{name}")
	public String getName(@PathVariable String name) {
		return "John";
	}
	@GetMapping(value="/getName")
	public String name(@RequestParam String name) {
		return name;
	}
	@GetMapping(value="/putData")
	public Student getValue(@RequestBody Student s) {
		return s;
	} 

}
