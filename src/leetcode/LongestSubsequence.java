package leetcode;

public class LongestSubsequence {

    public static int lengthSubsequence(String a, String b) {
        int [][] memo = new int[a.length()][b.length()];
        for(int j=0; j<b.length();j++) {
            if(a.charAt(0)==b.charAt(j)) {
                memo[0][j] = 1;
            }
        }
        for(int i=0; i<a.length(); i++) {
            if(a.charAt(i)==b.charAt(0)) {
                memo[i][0] = 1;
            }
        }
        for(int i=1; i<a.length(); i++) {
            for(int j=1; j<b.length(); j++) {
                if(a.charAt(i)==b.charAt(j)) {
                    memo[i][j] = memo[i-1][j-1] + 1;
                } else {
                    memo[i][j] = Math.max(memo[i][j-1], memo[i-1][j]);
                }
            }
        }
        return memo[a.length()-1][b.length()-1];
    }

}
