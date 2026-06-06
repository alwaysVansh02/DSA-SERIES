// Given an array arr of 0s and 1s. Find and return the length of the longest subarray with equal number of 0s and 1s.

// Examples:

// Input: arr[] = [1, 0, 1, 1, 1, 0, 0]
// Output: 6
// Explanation: arr[1...6] is the longest subarray with three 0s and three 1s.
package PrefixSum;

import java.util.HashMap;

public class Longest_Subarray_EqualNo_ZeroOne {
//  Aproach using hashmap and prefix sum aproach in time--> O(n) and space -->O(n)
        static int longleng(int[] arr){
            HashMap<Integer, Integer> mp = new HashMap<>();
            int prefsum = 0;
            int res =0;
            for (int i = 0; i< arr.length;i++){
                prefsum += (arr[i] == 0) ? -1 : 1; 
                if (prefsum == 0)
                    res = i + 1;
                if (mp . containsKey(prefsum))
                    res = Math.max(res , i - mp.get(prefsum));
                else
                    mp.put(prefsum, i);
            }
            return res;
        }
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,0,1,1};
        System.out.println("Longest length is: " + longleng(arr) );
    }
}
