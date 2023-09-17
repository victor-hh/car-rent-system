package com.unisinos.carrentsystem.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.unisinos.carrentsystem.entity.Person;
import com.unisinos.carrentsystem.repository.PersonRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository repository;

    public Person save(Person person) {
        return repository.save(person);
    }

    public List<Person> findAll() {
        return repository.findAll();
    }

    public Person findById(UUID id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(UUID id) {
        repository.deleteById(id);
    }

}
