
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
	
	//GET HTTP Method
	//When client writes" http://localhost:8080/hello-world " then helloWorld() method executed
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return"Hello World!";
	}
	
	/* 
	 I used this hello url to check whether spring boot devtools dependency work properly or not
	 Spring boot dev tools help developer in a way that if you make any changes 
	 Instead of terminating and restarting again you can just
	 press Ctrl+S and save file while console is running and save changes
	*/
	
	@GetMapping("/hello")
	public String hello() {
		return"Hello only!";
	}
}
