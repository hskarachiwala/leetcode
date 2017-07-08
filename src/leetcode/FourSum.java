package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by hkarachiwala on 4/1/17.
 */
public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        if(nums.length < 4) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);

        Set<List<Integer>> set = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length;j++) {
                int remSum = target - nums[i] - nums[j];

                int k = j+1;
                int l = nums.length-1;
                while(k<nums.length && k<l) {
                    if(nums[i] + nums[j] + nums[k] + nums[l] == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        set.add(list);
                        System.out.println("List added");
                    }
                    if(nums[k] + nums[l] < remSum) {
                        k++;
                    } else if(nums[k] + nums[l] > remSum) {
                        l--;
                    } else {
                        k++;
                        l--;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
