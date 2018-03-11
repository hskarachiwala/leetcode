package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hkarachiwala on 4/5/17.
 */
public class Trie {

    public void insert(TrieNode root, String word, int index) {
        if(index < word.length()) {
            if(!root.map.containsKey(word.charAt(index))) {
                root.map.put(word.charAt(index), new TrieNode());
            }
            insert(root.map.get(word.charAt(index)), word, index+1);
        } else {
            root.isWord = true;
        }
    }

    public boolean search(String word, TrieNode root) {
        for(int i=0; i<word.length(); i++) {
            if(!root.map.containsKey(word.charAt(i))) {
                return false;
            }
            root = root.map.get(word.charAt(i));
        }
        return root.isWord;
    }

    public List<String> startsWith(String word, TrieNode root) {
        List<String> words = new ArrayList<>();
        for(int i=0; i<word.length(); i++) {
            if(!root.map.containsKey(word.charAt(i))) {
                return words;
            }
            root = root.map.get(word.charAt(i));
        }
        dfs(root, words, word);
        return words;
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
