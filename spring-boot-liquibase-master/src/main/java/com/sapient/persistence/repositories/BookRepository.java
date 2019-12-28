package com.sapient.persistence.repositories;

import com.sapient.persistence.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
