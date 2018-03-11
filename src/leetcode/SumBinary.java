package leetcode;

public class SumBinary {

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        String shorter = a.length() <= b.length() ? a : b;
        String longer = a.length() > b.length() ? a : b;

        boolean carry = false;
        for(int i=shorter.length()-1; i>=0; i--) {
            if(shorter.charAt(i)=='1' && longer.charAt(i)=='1') {
                if(carry) {
                    sb.append('1');
                } else {
                    sb.append('0');
                }
                carry = true;
            } else if(shorter.charAt(i)=='0' && longer.charAt(i)=='0') {
                if(carry) {
                    sb.append('1');
                    carry = false;
                } else {
                    sb.append('0');
                }
            } else {
                if(carry) {
                    sb.append('0');
                } else {
                    sb.append('1');
                }
            }
        }
        for(int i=longer.length()-shorter.length()-1; i>=0; i--) {
            if(longer.charAt(i)=='1') {
                if(carry) {
                    sb.append('0');
                } else {
                    sb.append('1');
                }
            } else {
                if(carry) {
                    sb.append('1');
                    carry = false;
                } else {
                    sb.append('0');
                }
            }
        }
        if(carry) {
            sb.append('1');
        }
        return sb.reverse().toString();
    }

}
