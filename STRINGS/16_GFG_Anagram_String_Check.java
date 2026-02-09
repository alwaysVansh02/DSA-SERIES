package BinarySearch_Problem;
import java.util.Arrays;
class solution {
    public static boolean areAnagrams(String sl, String s2) {

        if (sl.length() != s2.length()) {
            return false;
        } else {
            char chl[] = sl.toCharArray();
            char ch2[] = s2.toCharArray();
            Arrays.sort(chl);
            Arrays.sort(ch2);
            if (Arrays.equals(chl, ch2)) {
                return true;
            } else {
                return false; 
            }
        }
    }
}
