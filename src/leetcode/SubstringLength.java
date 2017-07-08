package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by hkarachiwala on 3/11/17.
 */
public class SubstringLength {

    public int  lengthOfLongestSubstring(String s) {

        int maxLength = 0;
        int start = 0;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0; i<s.length();i++) {
            if((map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) >= start)) {
                maxLength = maxLength < i - start ? i - start : maxLength;
                start = map.get(s.charAt(i)) + 1;
                map.put(s.charAt(i), i);
            } else {
                map.put(s.charAt(i),i);
            }
        }

        maxLength = s.length()-start > maxLength ? s.length()-start : maxLength;

        return maxLength;

    }

}
