package leetcode;

public class CompressString {

    public static String compressString(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char current = s.charAt(0);
        for(int i = 1; i<s.length(); i++) {
            if(s.charAt(i)==current) {
                count++;
            } else {
                sb.append(current);
                sb.append(count);
                current = s.charAt(i);
                count = 1;
            }
        }
        sb.append(current);
        sb.append(count);
        return sb.toString().length() < s.length() ? sb.toString() : s;
    }

}
