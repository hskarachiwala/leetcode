package leetcode;

import java.util.HashSet;
import java.util.Set;

public class AllSubsets {

    public static Set<Set<Integer>> allSets(int[] a, int start, Set<Set<Integer>> sets) {
        if(start==a.length) {
            Set<Integer> newSet = new HashSet<>();
            sets.add(newSet);
            return sets;
        }
        sets = allSets(a, start + 1, sets);
        Set<Set<Integer>> allSubsets = new HashSet<>();
        allSubsets.addAll(sets);
        for(Set<Integer> set : sets) {
            Set<Integer> newSet = new HashSet<>(set);
            newSet.add(a[start]);
            allSubsets.add(newSet);
        }
        return allSubsets;
    }
}
