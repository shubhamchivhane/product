package com.product.repository;

import org.springframework.data.repository.CrudRepository;

import com.product.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
