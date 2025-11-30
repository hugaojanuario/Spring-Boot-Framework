package com.challenge.bms.book_management_system.service;

import com.challenge.bms.book_management_system.entity.Book;
import com.challenge.bms.book_management_system.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class BookService {
    private final BookRepository bookRepository;

    public void saveBook (Book book){
        bookRepository.saveAndFlush(book);
    }

    public List <Book> listBook (){
        return bookRepository.findAll();
    }

    public Optional <Book> buscarPorId(Long id){
        return bookRepository.findById(id);
    }

    public void deletarPorId(Long id){
        bookRepository.deleteById(id);
    }

    //falta fazer: Atualiza um livro existente. Use @Valid no parâmetro Book.
}
