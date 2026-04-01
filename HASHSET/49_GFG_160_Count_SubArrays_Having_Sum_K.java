package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Count_SubArrays_Having_Sum_K {
  static int cntSubArrays(int[] arr, int k){
        Map<Integer,Integer> prefixSum = new HashMap<>();
        int res =0;
        int curSum =0;
        for (int  i=0; i< arr.length;i++){
            curSum += arr[i];
            if (curSum== k)
                res++;
            if (prefixSum.containsKey(curSum - k))
                res += prefixSum.get(curSum - k);
            prefixSum.put(curSum, prefixSum.getOrDefault(curSum, 0) + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10,2,-2,-20,10}; 
        int k = -10;
        System.out.println("Count Of Subarrays Are : " + cntSubArrays( arr, k));
    }
}
