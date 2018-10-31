package com.nexign.springdemoproject.repositories;

import com.nexign.springdemoproject.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
