package com.sapient.service;

import com.sapient.persistence.entities.Book;
import com.sapient.persistence.repositories.BookRepository;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookService {

  private BookRepository bookRepository;

  @Autowired
  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  public Stream<Book> getAllBooks() {
    return StreamSupport.stream(bookRepository.findAll().spliterator(), true);
  }
}
