package com.challenge.bms.book_management_system.controller;


import com.challenge.bms.book_management_system.entity.Book;
import com.challenge.bms.book_management_system.service.BookService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    @PostMapping
    public ResponseEntity<Void> saveBook(@RequestBody Book book){
        bookService.saveBook(book);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public List <Book> listBook(){
        return bookService.listBook();
    }

    @GetMapping("{id}")
    public ResponseEntity<Book> buscarPorId(@PathVariable Long id) {
        return bookService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        bookService.deletarPorId(id);
        return ResponseEntity.noContent().build();
    }

}
