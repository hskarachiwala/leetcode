package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hkarachiwala on 3/11/17.
 */
public class Phonepad {

    public static List<String> letterCombinations(String digits) {

        List<String> results = new ArrayList<>();
        Map<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqr");
        map.put('8',"stu");
        map.put('9',"wxyz");

        results.add("");
        return createWordList(digits, 0, results, map);
    }

    public static List<String> createWordList(String digits, int index, List<String> results, Map<Character, String> map) {
        if(index==digits.length()) {
            return results;
        }
        List<String> restResults = createWordList(digits, index+1, results, map);
        String chars;
        if(digits.charAt(index)=='0' || digits.charAt(index)=='1') {
            chars = digits.charAt(index) + "";
        } else {
            chars = map.get(digits.charAt(index));
        }
        List<String> newResults = new ArrayList<>();
        for(String res : restResults) {
            for(int i=0; i<chars.length();i++) {
                newResults.add(chars.charAt(i) + res);
            }
        }
        return newResults;
    }

}
