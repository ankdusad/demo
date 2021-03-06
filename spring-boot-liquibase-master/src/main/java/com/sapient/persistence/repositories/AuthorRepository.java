package com.sapient.persistence.repositories;

import com.sapient.persistence.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
