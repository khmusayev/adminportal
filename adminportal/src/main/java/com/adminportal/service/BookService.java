package com.adminportal.service;

import com.adminportal.domain.Book;

public interface BookService {
	
	Book createBook(Book book) throws Exception;

	Book save(Book book);
	
}
