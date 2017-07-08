package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hkarachiwala on 3/11/17.
 */
public class Anagram {

    public List<List<String>> anagramGroups(String[] wordList) {

        Map<String, List<String>> anagramMap = new HashMap<String,List<String>>();

        for(int i=0; i<wordList.length; i++) {
            char[] arr = wordList[i].toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            if(!anagramMap.containsKey(key)) {
                List<String> anagrams = new ArrayList<String>();
                anagramMap.put(key, anagrams);
            }
            List<String> thisList = anagramMap.get(key);
            thisList.add(wordList[i]);
            anagramMap.put(key,thisList);
        }

        List<List<String>> resultList = new ArrayList<List<String>>();

        for(String key : anagramMap.keySet()) {
            resultList.add(anagramMap.get(key));
        }

        return resultList;

    }
}
