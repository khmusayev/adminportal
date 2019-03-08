package com.adminportal.service;

import java.util.List;

import com.adminportal.domain.Book;

public interface BookService {
	
	Book createBook(Book book) throws Exception;

	Book save(Book book);

	List<Book> findAll();

	Book findOne(Long id);
	
}
