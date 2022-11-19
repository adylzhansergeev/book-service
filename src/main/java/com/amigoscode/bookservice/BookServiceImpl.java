package com.amigoscode.bookservice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book save(BookSaveRequest request) throws IllegalStateException {
        Book book = Book.builder()
                .name(request.getName())
                .author(request.getAuthor())
                .price(request.getPrice())
                .build();

        return bookRepository.save(book);
    }

    @Override
    public Book findById(Integer id) throws IllegalStateException {
        if (id == null){
            throw new IllegalStateException("book id is null");
        }
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer id) throws IllegalStateException {
        if (id == null){
            throw new IllegalStateException("book id is null");
        }
        bookRepository.deleteById(id);
    }
}
