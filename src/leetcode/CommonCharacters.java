package leetcode;

import java.util.HashSet;
import java.util.Set;

public class CommonCharacters {

    public static String commonCharacters(String a, String b) {
        Set<Character> set = new HashSet<>();
        for (int i=0; i<a.length(); i++) {
            set.add(a.charAt(i));
        }

        Set<Character> result = new HashSet<>();
        for(int i=0; i<b.length(); i++) {
            if(set.contains(b.charAt(i))) {
                result.add(b.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Character c: result) {
            sb.append(c);
        }
        return sb.toString();
    }
}
