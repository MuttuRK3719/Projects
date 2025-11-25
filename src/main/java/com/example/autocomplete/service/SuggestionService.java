package com.example.autocomplete.service;

import com.example.autocomplete.trie.TrieIndex;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SuggestionService {

    private final TrieIndex trie;

    public SuggestionService(TrieIndex trie){
        this.trie = trie;

        // Initial sample data
        trie.insert("laptop", 0.9);
        trie.insert("laptop stand", 0.7);
        trie.insert("laptop bag", 0.6);
        trie.insert("lapdesk", 0.5);
        trie.insert("lamp", 0.4);
        trie.insert("lamborghini", 0.3);
    }

    public List<String> getSuggestions(String prefix){
        return trie.getByPrefix(prefix, 10);
    }
}
