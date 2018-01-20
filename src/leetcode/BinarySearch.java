package leetcode;

public class BinarySearch {

    public static boolean search(int a[], int left, int right, int x) {
        if(left>right) {
            return false;
        }
        int mid = (left + right)/2;
        if(a[mid]==x) {
            return true;
        }
        if(a[left]<a[mid]) {
            if(x>=a[left] && x<=a[mid]) {
                return search(a, left, mid-1, x);
            } else {
                return search(a, mid+1, right, x);
            }
        } else {
            if(x>=a[mid] && x<=a[right]) {
                return search(a, mid+1, right, x);
            } else {
                return search(a, left, mid-1, x);
            }
        }
    }
}
