package com.nexign.springdemoproject.repositories;

import com.nexign.springdemoproject.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
