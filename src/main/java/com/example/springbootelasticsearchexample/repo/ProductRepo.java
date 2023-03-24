package com.example.springbootelasticsearchexample.repo;

import com.example.springbootelasticsearchexample.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepo extends ElasticsearchRepository<Product,Integer> {

        }
