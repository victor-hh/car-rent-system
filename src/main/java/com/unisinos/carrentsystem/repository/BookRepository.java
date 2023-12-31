package com.unisinos.carrentsystem.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unisinos.carrentsystem.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, UUID> {
}
