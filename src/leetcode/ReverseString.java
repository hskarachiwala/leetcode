package leetcode;

public class ReverseString {

    public static String reverse(String s) {
        char str[] = s.toCharArray();
        for(int i=0, j=str.length-1; i<j; i++,j--) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
        return new String(str);
    }
}
