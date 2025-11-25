package com.example.autocomplete.trie;

import java.util.List;

public interface TrieIndex {
    void insert(String term, double score);
    List<String> getByPrefix(String prefix, int limit);
}
