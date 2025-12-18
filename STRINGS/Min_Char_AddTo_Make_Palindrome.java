package BinarySearch_Problem;
public class solution {
    public int minChar(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String temp = s + "$" + rev;
        int[] Ips = new int[temp.length()];
        int len = 0;
        int i = 1;
        while (i < temp.length()) {
            if (temp.charAt(i) == temp.charAt(len)) {
                len++;
                Ips[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = Ips[len - l];
                } else {
                    Ips[i] = 0;
                    i++;
                }
            }
        }
        return s.length() - lps[temp.length() - 1];
    }
}
