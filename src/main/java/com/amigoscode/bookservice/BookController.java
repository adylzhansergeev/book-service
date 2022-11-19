package com.amigoscode.bookservice;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1/books")
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping
    public void saveBook(@RequestBody BookSaveRequest request){
        log.info("save new book {}", request);
        bookService.save(request);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getBook(@PathVariable Integer id){
        return ResponseEntity.ok(bookService.findById(id));
    }
}
