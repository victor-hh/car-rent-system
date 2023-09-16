package com.unisinos.carrentsystem.service;

import com.unisinos.carrentsystem.entity.Book;
import com.unisinos.carrentsystem.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository repository;

    public List<Book> findAll() {
        return repository.findAll();
    }

    public Book save(Book book) {
        return repository.save(book);
    }

}
