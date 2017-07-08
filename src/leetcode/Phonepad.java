package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hkarachiwala on 3/11/17.
 */
public class Phonepad {

    public List<String> letterCombinations(String digits) {

        List<String> results = new ArrayList<String>();
        Map<Character, String> map = new HashMap<Character, String>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqr");
        map.put('8',"stu");
        map.put('9',"wxyz");

        return createWordList(digits, 0, results, map);
    }

    List<String> createWordList(String s, int index, List<String> results, Map<Character, String> map) {

        if(index==s.length()) {
            return results;
        }

        String thisDigit = map.get(s.charAt(index));
        List<String> newList = new ArrayList<String>();

        if(results.isEmpty()) {
            for (Character c : thisDigit.toCharArray()) {
                newList.add(c + "");
            }
        } else {
            for(String str : results) {
                for(Character ch : thisDigit.toCharArray()) {
                    newList.add(str + ch);
                }
            }
        }

        return createWordList(s, index+1, newList, map);

    }

}
