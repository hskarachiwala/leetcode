package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Axoni {

    public static class RetVal {
        public Character c;
        public Integer i;
        public RetVal(Character c, Integer i) {
            this.c = c;
            this.i = i;
        }
    }

    public static String isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put(']','[');
        map.put(')','(');
        map.put('}','{');
        Set<Character> opening = new HashSet<>();
        opening.add('(');
        opening.add('[');
        opening.add('{');
        for(int i=0; i<str.length(); i++) {
            if(opening.contains(str.charAt(i))) {
                stack.push(str.charAt(i));
            } else {
                if(stack.empty()) {
                    return "NO";
                }
                Character character = stack.pop();
                if(map.get(str.charAt(i))!=character) {
                    return "NO";
                }
            }
        }
        if(stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static int candies(int[][]inputs) {
        int sum = 0;
        for(int i=0; i<inputs.length; i++) {
            sum = sum + ((inputs[i][1] - inputs[i][0] + 1) * inputs[i][2]);
        }
        return sum/inputs.length;
    }

    public static int max(int[][]inputs) {
        int[] arr = new int[10];
        int max = 0;
        for(int i=0; i<inputs.length; i++) {
            for(int index = inputs[i][0]-1; index<=inputs[i][1]-1; index++) {
                arr[index] = arr[index] + inputs[i][2];
                max = Math.max(arr[index], max);
            }
        }
        return max;
    }

}
