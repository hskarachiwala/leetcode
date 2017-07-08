package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hkarachiwala on 4/5/17.
 */
public class Trie {

    public void insert(String word, TrieNode root, int index) {

        if(index==word.length()-1) {
            root.isWord = true;
            if(!root.map.containsKey(word.charAt(index))) {
                root.map.put(word.charAt(index), new TrieNode());
            }
            return;
        }
        if(root.map.containsKey(word.charAt(index))) {
            TrieNode next = root.map.get(word.charAt(index));
            insert(word, next, ++index);
        } else {
            TrieNode newNode = new TrieNode();
            root.map.put(word.charAt(index), newNode);
            insert(word, newNode, ++index);
        }
    }

    public boolean search(String word, TrieNode root, int index) {

        if(index==word.length()) {
            return true;
        }
        if(!root.map.containsKey(word.charAt(index))) {
            return false;
        }
        TrieNode next = root.map.get(word.charAt(index));
        return search(word, next, ++index);
    }

    public List<String> prefixSearch(String word, TrieNode root) {

        List<String> results = new ArrayList<>();

        TrieNode current = root;
        for(int i=0; i<word.length();i++) {
            current = current.map.get(word.charAt(i));
            if(current==null) {
                return results;
            }
        }

        dfs(current, results, word);

        return results;
    }

    private void dfs(TrieNode root, List<String> results, String word) {

        for(Character c : root.map.keySet()) {
            TrieNode node = root.map.get(c);
            if(node.isWord) {
                results.add(word + c);
            }
            dfs(node, results, word + c);
        }
    }

}
