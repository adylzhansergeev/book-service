package com.amigoscode.bookservice;

import java.util.List;

public interface BookService {

    List<Book> findAll();
    Book save(BookSaveRequest request) throws IllegalStateException;
    Book findById(Integer id) throws IllegalStateException;
    void deleteById(Integer id) throws IllegalStateException;
}
