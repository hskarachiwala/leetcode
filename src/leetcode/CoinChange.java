package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Collections.min;

/**
 * Created by hkarachiwala on 4/30/17.
 */
public class CoinChange {

    public int coinChange(int[] coins, int amount) {

        Map<Integer, Integer> map = new HashMap<>();
        if(amount==0) {
            return 0;
        }
        return count(map, amount, coins);

    }

    public int count(Map<Integer, Integer> map, int amount, int [] coins) {

        if(map.containsKey(amount)) {
            return map.get(amount);
        }

        List<Integer> results = new ArrayList<>();
        for(int i=0; i<coins.length; i++) {
            if(coins[i]==amount) {
                map.put(amount, 1);
                return 1;
            } else if (coins[i] > amount) {
                continue;
            } else {
                int c = count(map, amount - coins[i], coins);
                if(c>-1) {
                    results.add(1+c);
                }
            }
        }

        if(results.isEmpty()) {
            return -1;
        } else {
            int m = min(results);
            map.put(amount, m);
            return m;
        }
    }

    int min(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for(int i : list) {
            if(min>i) {
                min = i;
            }
        }
        return min;
    }

}
