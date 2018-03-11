package leetcode;

public class RecursivePrint {

    public static void printRecursive(int n) {
        System.out.println(n);
        if(n==100) {
            return;
        }
        printRecursive(n+1);
        System.out.println(n);
    }

}
