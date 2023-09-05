package com.test.preparation.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerResponse {
	@GetMapping(value="/response")
	public  ResponseEntity<String> getResponse(){
		return new ResponseEntity<>("Request not Valid",HttpStatus.BAD_REQUEST);
	}
}
