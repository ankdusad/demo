package com.sapient.controller;

import com.sapient.persistence.entities.Book;
import com.sapient.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping
    public List<Book> load() {
        return bookService.getAllBooks().collect(Collectors.toList());
    }
}