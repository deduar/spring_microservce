package com.deduar.productmicroservice.repository;

import com.deduar.productmicroservice.entity.ProductEntity;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {
    
}
