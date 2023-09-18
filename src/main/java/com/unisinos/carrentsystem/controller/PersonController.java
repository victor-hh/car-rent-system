package com.unisinos.carrentsystem.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unisinos.carrentsystem.entity.Person;
import com.unisinos.carrentsystem.service.PersonService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService service;

    @PostMapping()
    public ResponseEntity<Person> save(@RequestBody Person person) {
        Person savedPerson = service.save(person);
        return ResponseEntity.ok(savedPerson);
    }

    @GetMapping("all")
    public ResponseEntity<List<Person>> findAll() {
        List<Person> persons = service.findAll();
        return ResponseEntity.ok(persons);
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<Person> findById(@PathVariable(value = "uuid") UUID uuid) {
        Person person = service.findById(uuid);
        return ResponseEntity.ok(person);
    }

    @DeleteMapping("/{uuid}")
    public ResponseEntity<Void> deleteById(@PathVariable(value = "uuid") UUID uuid) {
        service.deleteById(uuid);
        return ResponseEntity.ok().build();
    }

}
