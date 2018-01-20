package leetcode;

import java.util.Map;
import java.util.Set;

public class WordComponents {

    public static String getWords(Set<String> dictionary, String word, Map<String, String> cache) {
        if(dictionary.contains(word)) {
            return word;
        }
        if(cache.containsKey(word)) {
            return cache.get(word);
        }
        for(int i=1; i<word.length();i++) {
            String first = word.substring(0, i);
            String rest = word.substring(i);
            if(dictionary.contains(first)) {
                String remaining = getWords(dictionary, rest, cache);
                if(remaining!=null) {
                    cache.put(word, first + " " + remaining);
                    return first + " " + remaining;
                }
            }
        }
        return null;
    }
}
