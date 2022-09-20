package com.ajpl.cop.services;


import com.ajpl.cop.clients.SearchClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GoogleSearchService {

    private String apiKey = "HI";
    private String clientId = "HI";

    private final SearchClient client;
    public ResponseEntity<String> search(String query) {
        return client.search(apiKey, clientId, query);
    }
}
