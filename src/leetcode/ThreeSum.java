package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> results = new HashSet<List<Integer>>();
        for(int i=0; i<nums.length-2; i++) {
            int remainingSum = 0 - nums[i];
            List<List<Integer>> pairs = findPairs(nums, i+1, remainingSum);
            for(List<Integer> pair:pairs) {
                pair.add(nums[i]);
            }
            results.addAll(pairs);
        }
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        resultList.addAll(results);
        return resultList;
    }

    private static List<List<Integer>> findPairs(int[] a, int index, int remainingSum) {
        int last = a.length-1;
        int start = index;
        List<List<Integer>> pairs = new ArrayList<List<Integer>>();
        while(start<last) {
            if(a[start] + a[last]==remainingSum) {
                List<Integer> newPair = new ArrayList<Integer>();
                newPair.add(a[start]);
                newPair.add(a[last]);
                pairs.add(newPair);
                start++;
                last--;
            } else if(a[start]+a[last]<remainingSum) {
                start++;
            } else {
                last--;
            }
        }
        return pairs;
    }

}
