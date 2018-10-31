package com.nexign.springdemoproject.repositories;

import com.nexign.springdemoproject.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
