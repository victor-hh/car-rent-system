package com.unisinos.carrentsystem.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unisinos.carrentsystem.entity.Book;
import com.unisinos.carrentsystem.service.BookService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService service;

    @PostMapping()
    public ResponseEntity<Book> save(@RequestBody Book book) {
        Book savedBook = service.save(book);
        return ResponseEntity.ok(savedBook);
    }

    @GetMapping("all")
    public ResponseEntity<List<Book>> findAll() {
        List<Book> books = service.findAll();
        return ResponseEntity.ok(books);
    }

    @GetMapping("uuid")
    public ResponseEntity<Book> findById(UUID uuid) {
        Book book = service.findById(uuid)
        return ResponseEntity.ok(book);
    }

    @DeleteMapping("uuid")
    public ResponseEntity<Void> deleteById(UUID uuid) {
        service.deleteById(uuid);
        return ResponseEntity.ok().build();
    }

}
