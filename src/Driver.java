import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import leetcode.AllSubsets;
import leetcode.BinarySearch;
import leetcode.Paths;
import leetcode.WordComponents;

/**
 * Created by hkarachiwala on 3/8/17.
 */

public class Driver {

    public static void main(String[] args) {
        Set<String> dictionary = new HashSet<>();
        dictionary.add("aple");
        dictionary.add("app");
        dictionary.add("pie");
        dictionary.add("pl");
        dictionary.add("ap");
        String word = "applepie";
        System.out.println(WordComponents.getWords(dictionary, word, new HashMap<>()));
    }

    private static void inputOutput() {
        Scanner sc = new Scanner(System.in);
        Integer i = sc.nextInt();
        System.out.println(i);
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println(s);
    }
}
