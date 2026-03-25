package Hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Subsequence {
   static int longestConsecutive(int[] arr){
        Set<Integer> st = new HashSet<>();
        int res =0;
        for (int val : arr)
            st.add(val);
        for (int val : arr){
            if (st.contains(val) && !st.contains(val - 1)){
                int cur = val , count =0;
                while (st.contains(cur)){
                    st.remove(cur);
                    cur++;
                    count++;
                }
                res = Math.max(res, count);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,6,1,9,4,5,3};
        System.out.println(" The Longest Consecutive Subsequence is " + longestConsecutive(arr));
    }
}
