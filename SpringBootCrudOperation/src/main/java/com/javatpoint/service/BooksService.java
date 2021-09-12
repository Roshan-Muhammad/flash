package com.javatpoint.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.javatpoint.model.Books;
import com.javatpoint.repository.BooksRepository;

public class BooksService {

	@Autowired
	BooksRepository booksRepository;
	
	public List<Books> getAllBooks() {
		List<Books> books = new ArrayList<Books>();
		booksRepository.findAll().forEach(books1 -> books.add(books1));
		return books;
	}

	public Books getBooksById(int bookid) {

		return booksRepository.findById(bookid).get();
	}

	public void delete(int bookid) {
		 booksRepository.deleteById(bookid);
		
	}

	public void saveOrUpdate(Books books) {
		booksRepository.save(books);
	}

}
