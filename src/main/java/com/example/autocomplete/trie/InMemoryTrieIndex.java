package com.example.autocomplete.trie;

import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class InMemoryTrieIndex implements TrieIndex {

    static class Node {
        Map<Character, Node> children = new HashMap<>();
        boolean end;
        double score;
    }

    private final Node root = new Node();

    @Override
    public void insert(String term, double score){
        Node current = root;
        for(char c : term.toCharArray()){
            current = current.children.computeIfAbsent(c, k -> new Node());
        }
        current.end = true;
        current.score = score;
    }

    @Override
    public List<String> getByPrefix(String prefix, int limit){
        Node cur = root;
        for(char c : prefix.toCharArray()){
            if(!cur.children.containsKey(c)) return List.of();
            cur = cur.children.get(c);
        }

        List<String> result = new ArrayList<>();
        dfs(cur, prefix, result, limit);
        return result;
    }

    private void dfs(Node node, String path, List<String> out, int limit){
        if(out.size() >= limit) return;

        if(node.end) out.add(path);

        for(var entry : node.children.entrySet()){
            dfs(entry.getValue(), path + entry.getKey(), out, limit);
        }
    }
}
