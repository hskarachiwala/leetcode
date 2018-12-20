import leetcode.CitiesCodeChef;

/**
 * Created by hkarachiwala on 3/8/17.
 */

public class Driver {

    public static void main(String[] args) {
        int cities = 10;
        int[] adj = {9, 1, 4, 9, 0, 4, 8, 9, 0, 1};

        int[] res = CitiesCodeChef.getDistances(cities, adj);
        for(int i=0; i<res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
