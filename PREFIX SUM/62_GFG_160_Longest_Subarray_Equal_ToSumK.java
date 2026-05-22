// Given an array arr[] containing integers and an integer k, your task is to find the length of the longest subarray where the sum of its elements is equal to the given value k. If there is no subarray with sum equal to k, return 0.
// Examples:

// Input: arr[] = [10, 5, 2, 7, 1, -10], k = 15
// Output: 6
// Explanation: Subarrays with sum = 15 are [5, 2, 7, 1], [10, 5] and [10, 5, 2, 7, 1, -10]. The length of the longest subarray with a sum of 15 is 6.
package PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class Longest_Subarray_With_Sum_EqualK {
   static int longestSubarray(int[] arr, int k){
        Map<Integer,Integer> map = new HashMap<>();
        int res =0;
        int prefSum =0;
        for (int i = 0; i< arr.length; i++){
            prefSum += arr[i];
            if (prefSum == k)
                res = i+1;
            else if (map.containsKey(prefSum - k))
                res = Math.max(res, i - map.get(prefSum - k));
            if (!map.containsKey(prefSum))
                map.put(prefSum, i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 10,5,2,7,1,-10};
        int k = 15;
        System.out.println("Lngest Subarray With Sum Equyal to K is :" + longestSubarray(arr,k));
    }
}
