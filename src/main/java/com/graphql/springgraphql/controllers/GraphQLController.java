package com.graphql.springgraphql.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graphql.springgraphql.service.GraphQLService;

@RestController
@RequestMapping("/rest/books")
public class GraphQLController {

	@Autowired
	private GraphQLService graphQLService;
	
	@PostMapping
	public ResponseEntity<Object> getAllBooks(@RequestBody String query) {
		return new ResponseEntity<>(graphQLService.getGraphQL().execute(query), HttpStatus.OK);
	}
}
