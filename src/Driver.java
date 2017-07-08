import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import leetcode.CoinChange;
import leetcode.NonDuplicate;
import leetcode.Trie;
import leetcode.TrieNode;

/**
 * Created by hkarachiwala on 3/8/17.
 */

public class Driver {

    public static void main(String[] args) {

        int [] coins = {1,2,5};
        int amount = 100;
        CoinChange c = new CoinChange();
        System.out.println(c.coinChange(coins, amount));
    }
}
