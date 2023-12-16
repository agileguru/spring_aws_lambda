package com.doit.mirada.books;

import org.springframework.data.repository.ListCrudRepository;

@org.springframework.stereotype.Repository
public interface Repository extends ListCrudRepository<Book, Long> {

}
