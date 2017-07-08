package leetcode;

/**
 * Created by hkarachiwala on 3/18/17.
 */
public class RotateMatrix {

    public void rotate(int[][] a) {

        for(int i=0; i<a.length/2; i++) {

            int temp = 0;
            for(int j=i; j<a[0].length-i-1; j++) {

                temp = a[i][j];
                a[i][j] = a[i+j][a.length-1-i];
                a[i+j][a.length-1-i] = temp;
                System.out.println("Swapped " + a[i][j] + " and " + a[i+j][a.length-1-i]);

                temp = a[i][j];
                a[i][j] = a[a.length-1-i][a.length-1-j];
                a[a.length-1-i][a.length-1-j] = temp;
                System.out.println("Swapped " + a[i][j] + " and " + a[a.length-1-i][a.length-1-j]);

                temp = a[i][j];
                a[i][j] = a[a.length-1-j][i];
                a[a.length-1-j][i] = temp;
                System.out.println("Swapped " + a[i][j] + " and " + a[a.length-1-j][i]);

            }
        }
    }
}
