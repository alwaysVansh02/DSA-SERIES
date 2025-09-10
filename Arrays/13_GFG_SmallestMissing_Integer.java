//You are given an integer array arr[]. Your task is to find the smallest
//        positive number missing from the array.
//        Note: Positive number starts from 1. The array can have negative
//        integers too.
//        Examples:
//        Input: arro
//        Output: 3
//        Explanation: Smallest positive missing number is 3.
package ArrayGFG;

import java.util.HashSet;

public class GFGSmallestPositiveMissing {

    public int missingNumber(int[] arr) {
// code here
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (num > 0) {
                set.add(num);
            }
        }
        int smallest = 1;
        while (true) {
            if (!set.contains(smallest)){
            return smallest;
        }
        smallest++;
    }
}
    public static void main(String[] args) {
     GFGSmallestPositiveMissing obj = new GFGSmallestPositiveMissing();
     int []arr = {0,-10,1,3,-20};
     int result = obj.missingNumber(arr);
                System.out.println("smallest missing number is:" + result);
    }
}
