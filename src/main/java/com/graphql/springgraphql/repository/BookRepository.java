package com.graphql.springgraphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphql.springgraphql.model.Book;

public interface BookRepository extends JpaRepository<Book, String>{

}
