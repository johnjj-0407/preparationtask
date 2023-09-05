package com.test.preparation.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

public interface Students {
	public String getMessage();
}
@Service("junior")
@Primary
class JuniStudents implements Students {
	public String getMessage() {
		return "The class defines junior Strudent";
	}
}
@Service("senior")
class SeniorStudent implements Students {
	public String getMessage() {
		return "This class defines Senior Student";
	}
}