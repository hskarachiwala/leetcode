package leetcode;

/**
 * Created by hkarachiwala on 4/1/17.
 */
public class NonDuplicate {

    public int singleNonDuplicate(int[] nums) {

        return findNum(nums, 0, nums.length-1);

    }

    int findNum(int [] a, int start, int end) {

        if(start==end) {
            return a[start];
        }
        int mid = (start + end)/2;
        if( mid+1<a.length && a[mid] != a[mid+1] && mid-1>=0 && a[mid] != a[mid-1])
            return a[mid];

        if(mid%2==0) {
            if(a[mid]==a[mid+1]) {
                return findNum(a, mid+1, end);
            } else {
                return findNum(a, start, mid);
            }
        } else {
            if(a[mid-1]==a[mid]) {
                return findNum(a, mid+1, end);
            } else {
                return findNum(a, start, mid);
            }

        }

    }

}
