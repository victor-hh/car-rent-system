package com.unisinos.carrentsystem.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.unisinos.carrentsystem.entity.Book;
import com.unisinos.carrentsystem.repository.BookRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository repository;

    public Book save(Book book) {
        return repository.save(book);
    }

    public List<Book> findAll() {
        return repository.findAll();
    }

    public Book findById(UUID id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(UUID id) {
        repository.deleteById(id);
    }

}
