package com.example.autocomplete.controller;

import org.springframework.web.bind.annotation.*;
import com.example.autocomplete.service.SuggestionService;
import java.util.List;

@RestController
@RequestMapping("/api/suggest")
public class SuggestionController {

    private final SuggestionService service;

    public SuggestionController(SuggestionService service){
        this.service = service;
    }

    @GetMapping
    public List<String> suggest(@RequestParam String query){
        return service.getSuggestions(query);
    }
}
