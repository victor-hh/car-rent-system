package com.unisinos.carrentsystem.controller;

import com.unisinos.carrentsystem.entity.Person;
import com.unisinos.carrentsystem.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService service;

    @PostMapping
    public ResponseEntity<Person> save(@RequestBody Person person) {
        Person savedPerson = service.save(person);
        return ResponseEntity.ok(savedPerson);
    }

    @GetMapping("all")
    public ResponseEntity<List<Person>> findAll() {
        List<Person> persons = service.findAll();
        return ResponseEntity.ok(persons);
    }

}
