package leetcode;

public class BinarySearch {

    public static boolean search(int[] a, int start, int end, int x) {
        if(end<start) {
            return false;
        }
        int mid = (start + end)/2;
        if(a[mid]==x) {
            return true;
        }
        if(a[mid] > x) {
            return search(a, start, mid-1, x);
        } else {
            return search(a, mid+1, end, x);
        }
    }
}
