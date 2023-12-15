package com.doit.mirada;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc
public class DefaultController {

	@GetMapping("/hello")
	public String welcome() {
		return "Hello from AWS Lambda" ;
	}
	
}
