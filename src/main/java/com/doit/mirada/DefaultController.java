package com.doit.mirada;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.doit.mirada.books.BookService;
import com.google.gson.Gson;

@RestController
@EnableWebMvc
public class DefaultController {

	@Autowired
	private BookService bookService;
	
	private Gson gson = new Gson();
	
	@GetMapping("/hello")
	public String welcome() {
		return gson.toJson(bookService.createAndList());
	}
	
}
