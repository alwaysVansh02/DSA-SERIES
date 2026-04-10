package Hashing;

import java.util.HashMap;

public class Count_SubArrays_with_Given_XOR {
   static int subArrayXoR(int[]arr , int k){
        int res = 0;
        HashMap<Integer , Integer> mp = new HashMap<>();
        int prefXoR = 0;
        for (int val : arr){
            prefXoR ^= val;
            res += mp.getOrDefault(prefXoR ^ k , 0);
            if (prefXoR == k)
                res++;
            mp.put(prefXoR,mp.getOrDefault(prefXoR,0) +1);
        }
            return res; 
    }

    public static void main(String[] args) { 
        int[] arr = {4,2,2,6,4};
        int  k = 6;
        System.out.println("Count of Subarray Is: " + subArrayXoR(arr, k));
    }
}
