package com.Mapper.Mapper1;

import com.entity.MongoDb;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MongodbDao extends MongoRepository<MongoDb,Integer> {
    List<MongoDb> findByAuthorContains(String author);
    MongoDb findByNameEquals(String name);
}
