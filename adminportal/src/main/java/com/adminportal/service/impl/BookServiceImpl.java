package com.adminportal.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminportal.domain.Book;
import com.adminportal.repository.BookRepository;
import com.adminportal.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	private static final Logger LOG = LoggerFactory.getLogger(BookService.class);

	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book createBook(Book book) throws Exception {
		Book theBook = bookRepository.findBytitle(book.getTitle());

		if (theBook != null) {
			LOG.info("book {} already exists. Nothing will be done.", book.getTitle());
		} else {
			theBook = bookRepository.save(book);
		}

		return theBook;
	}

	@Override
	public Book save(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

}
