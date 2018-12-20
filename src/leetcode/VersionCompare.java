package leetcode;

public class VersionCompare {

    public static boolean versionCompare(String v1, String v2) {

        if(v1.equals(v2)) {
            return false;
        }

        String arr1[] = v1.split(".");  //["3", 4]
        String arr2[] = v2.split(".");  //[3, 6, 2]

        for(int i=0; i<arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        int[] v1parts = new int[4];
        for(int i=0; i<arr1.length; i++) {
            v1parts[i] = Integer.parseInt(arr1[i]);
        }

        int[] v2parts = new int[4];
        for(int i=0; i<arr2.length; i++) {
            v2parts[i] = Integer.parseInt(arr2[i]);
        }

        for(int i=0; i<v1parts.length; i++) {
            if(v1parts[i]<v2parts[i]) {
                System.out.println(v1parts[i] + "<" + v2parts[i]);
                return false;
            } else if(v1parts[i]>v2parts[i]) {
                System.out.println(v1parts[i] + ">" + v2parts[i]);
                return true;
            }
        }

        return false;
    }
}
