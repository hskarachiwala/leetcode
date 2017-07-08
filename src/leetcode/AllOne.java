package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class AllOne {

    class StackNode {
        int count;
        Set<String> set;
        StackNode(int count, Set<String> set) {
            this.count = count;
            this.set = set;
        }
    }

    public Map<String, Integer> map;
    public Map<Integer, Set<String>> reverseMap;
    Stack<StackNode> maxStack;
    Stack<StackNode> minStack;

    public AllOne() {
        map = new HashMap<>();
        maxStack = new Stack<>();
        minStack = new Stack<>();
    }

    /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
    public void inc(String key) {

        //init if not present
        if(!map.containsKey(key)) {
            map.put(key, 0);
        }

        //increment value
        int reverseKey = map.get(key)+1;
        map.put(key, reverseKey);

        //add to reverse map
        if(!reverseMap.containsKey(reverseKey)) {
            reverseMap.put(reverseKey, new HashSet<>());
        }
        Set<String> set = reverseMap.get(reverseKey);
        set.add(key);
        //remove from previous list
        if(reverseKey>1) {
            reverseMap.get(reverseKey-1).remove(key);
        }


    }

    /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
    public void dec(String key) {

        int count = map.get(key);
        if(count==1) {
            map.remove(key);
            reverseMap.get(1).remove(key);
        } else {
            map.put(key, count-1);
            reverseMap.get(count).remove(key);
            reverseMap.get(count-1).add(key);
        }


    }

    /** Returns one of the keys with maximal value. */
    public String getMaxKey() {

        if(maxStack.isEmpty()) {
            return "";
        }

        return "";
    }

    /** Returns one of the keys with Minimal value. */
    public String getMinKey() {

        if(minStack.isEmpty()) {
            return "";
        }

        return "";

    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */
