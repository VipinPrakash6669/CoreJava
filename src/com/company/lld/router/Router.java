package com.company.lld.router;

import java.util.HashMap;
import java.util.Map;

public class Router {

    public static class TrieNode{
        Map<String ,TrieNode> urlComponent;
        String value;
        boolean eou;

        public TrieNode() {
            urlComponent = new HashMap<>();
            value = "";
            eou = false;
        }
    }

    private TrieNode root = new TrieNode();

    public void add(String url,String value){
        String[] components = url.split("/");
        TrieNode node = root;
        for(String component : components){
            if(!node.urlComponent.containsKey(component)){
                node.urlComponent.put(component, new TrieNode());
            }
            node = node.urlComponent.get(component);
        }
        node.value=value;
        node.eou=true;
    }

    private String searchTrie(String[] components, int ind,TrieNode node) {

        if(ind ==components.length){
            if(node!=null&&node.eou){
                return node.value;
            }
            return null;
        }
        String result =null;
        if(components[ind].equals("*")){

            for(Map.Entry<String,TrieNode> child : node.urlComponent.entrySet()){
                result = searchTrie(components,ind+1,child.getValue());
            }
        }
        if(node!=null && node.urlComponent != null && node.urlComponent.containsKey(components[ind])){
            result = searchTrie(components,ind+1,node.urlComponent.get(components[ind]));
        }
        return result;
    }


    public String get(String url){
        String[] components =url.split("/");
        String value =searchTrie(components,0,root);
        if(value== null){
            return "Not found";
        }
        return value;
    }

}
