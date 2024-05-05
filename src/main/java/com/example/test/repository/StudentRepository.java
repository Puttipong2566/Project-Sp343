package com.example.test.repository;

import com.example.test.model.Students;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Students, String> {
}
