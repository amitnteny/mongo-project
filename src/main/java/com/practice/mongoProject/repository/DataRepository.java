package com.practice.mongoProject.repository;

import com.practice.mongoProject.domain.Data;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends MongoRepository<Data, String> { }
