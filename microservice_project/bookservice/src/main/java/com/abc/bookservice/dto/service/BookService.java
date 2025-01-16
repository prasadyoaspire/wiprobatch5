package com.abc.bookservice.dto.service;

import java.util.List;

import com.abc.bookservice.dto.BookDto;

public interface BookService {

	BookDto saveBook(BookDto bookDto);
	
	BookDto findBookById(long bookId);
	
	BookDto findBookByName(String bookName);
	
	List<BookDto> findAllBooks();
	
	List<BookDto> findAllBooksByCategory(String categoryName);
}
