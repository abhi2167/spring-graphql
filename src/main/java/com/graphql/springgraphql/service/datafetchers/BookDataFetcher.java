package com.graphql.springgraphql.service.datafetchers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.graphql.springgraphql.model.Book;
import com.graphql.springgraphql.repository.BookRepository;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;

@Component
public class BookDataFetcher implements DataFetcher<Book>{

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public Book get(DataFetchingEnvironment environment) {
		return bookRepository.findOne(environment.getArgument("id")).orElse(null);
	}

}
