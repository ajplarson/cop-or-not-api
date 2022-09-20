package com.ajpl.cop.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(name = "search", url="${feign.url}")
@FeignClient(name = "search", url="https://customsearch.googleapis.com")
public interface SearchClient {
    @RequestMapping(method = RequestMethod.GET, value = "/customsearch/v1")
    ResponseEntity<String> search(@RequestParam("key") String key, @RequestParam("cx") String clientId, @RequestParam("q") String query);
}
