package com.unisinos.carrentsystem.controller;

import com.unisinos.carrentsystem.entity.Book;
import com.unisinos.carrentsystem.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService service;

    @GetMapping("all")
    public List<Book> findAll() {
        return service.findAll();
    }

    @PostMapping()
    public Book save(@RequestBody Book book) {
        return service.save(book);
    }

}
