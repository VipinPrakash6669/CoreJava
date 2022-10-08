package com.company.lld.router;

import java.util.HashMap;
import java.util.Map;

public class RouterStar {
    static class TrieNode {
        Map<String, TrieNode> children;
        String value;
        boolean endOfWord;
        public TrieNode() {
            children = new HashMap<>();
            value = "";
            endOfWord = false;
        }
    }
    static TrieNode root = new TrieNode();

    public void add(String route, String data) {
        TrieNode pCrawl = root;
        String[] urlComponents = route.split("/");
        for(String component:urlComponents) {
            if(!pCrawl.children.containsKey(component)) {
                pCrawl.children.put(component, new TrieNode());
            }
            pCrawl = pCrawl.children.get(component);
        }
        pCrawl.endOfWord = true;
        pCrawl.value = data;
    }

    private String searchTrie(String[] urlComponents, int index, TrieNode node) {
        int size = urlComponents.length;
        if(index == size)
        {
            if(node != null && node.endOfWord) {
                return node.value;
            }
            else {
                return null;
            }
        }
        TrieNode pCrawl = node;

        String component = urlComponents[index];
        if("*".equals(component)) {
            String result = null;
            for(Map.Entry<String, TrieNode>entry:pCrawl.children.entrySet()) {
                TrieNode temp = entry.getValue();
                result = searchTrie(urlComponents, index+1, temp);
                if(result != null) {
                    return result;
                }
            }
            return result;
        }
        else if(pCrawl != null && pCrawl.children != null && pCrawl.children.containsKey(component)) {
            pCrawl = pCrawl.children.get(component);
            String result = searchTrie(urlComponents, index+1, pCrawl);
            return result;
        }
        else
        {
            return null;
        }

    }

    public String get(String route) {
        TrieNode pCrawl = root;
        String[] urlComponents = route.split("/");
        String result = searchTrie(urlComponents, 0, root);
        if(result == null) {
            result = "notFound!";
        }
        return result;
    }
}
