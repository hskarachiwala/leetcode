package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hkarachiwala on 4/5/17.
 */
public class TrieNode {

    public Map<Character, TrieNode> map;
    public boolean isWord;

    public TrieNode() {
        map = new HashMap<>();
        isWord = false;
    }

}
