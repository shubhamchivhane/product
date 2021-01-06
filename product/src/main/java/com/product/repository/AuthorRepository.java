package com.product.repository;

import org.springframework.data.repository.CrudRepository;

import com.product.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
