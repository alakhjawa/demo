package com.example.demo;

import com.example.demo.Book;
import java.util.List;

public interface BookService {

    Book createBook(Book book);
    List<Book> getAllBooks();
    Book getBookById(Long id);
    Book updateBook(Long id, Book book);
    void deleteBook(Long id);
}