package com.ajpl.cop.controllers;

import com.ajpl.cop.services.GoogleSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SearchController {

    private final GoogleSearchService service;


    @GetMapping("/{query}")
    ResponseEntity<String> one(@PathVariable String query) {
        return service.search(query);
    }
}
