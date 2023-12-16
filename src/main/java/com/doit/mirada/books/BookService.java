package com.doit.mirada.books;

import static java.util.UUID.randomUUID;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	private Repository bookRepository;
	
	public List<Book> createAndList() {
		String uuid = randomUUID().toString();
		Book book = new Book(null,uuid,uuid,uuid);
		
		bookRepository.save(book);
		return bookRepository.findAll();
	}
	
}
