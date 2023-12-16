package com.doit.mirada.books;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.google.gson.Gson;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class BookServiceTest {

	@Autowired
	private BookService bookService;
	
	private Gson gson = new Gson();
	
	@Test
	void testCanCreateAndReturnData() {
		List<Book> books = bookService.createAndList();
		assertThat(books).isNotNull().isNotEmpty();
		int numberOfBooks = books.size();
		
		books = bookService.createAndList();
		assertThat(books).isNotNull().isNotEmpty();

		assertThat(numberOfBooks).isLessThan(books.size());
	}

	@Test
	void testCanCreateJson() {
		List<Book> books = bookService.createAndList();
		assertThat(books).isNotNull().isNotEmpty();
		
		books = bookService.createAndList();
		assertThat(books).isNotNull().isNotEmpty();
		
		log.info(gson.toJson(books));
		
	}

}
