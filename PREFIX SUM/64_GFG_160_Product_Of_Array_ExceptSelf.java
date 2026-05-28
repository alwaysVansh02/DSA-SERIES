// Given an array, arr[] construct a product array, res[] where each element in res[i] is the product of all elements in arr[] except arr[i]. Return this resultant array, res[].
// Note: Each element is res[] lies inside the 32-bit integer range.

// Examples:

// Input: arr[] = [10, 3, 5, 6, 2]
// Output: [180, 600, 360, 300, 900]
// Explanation: For i=0, res[i] = 3 * 5 * 6 * 2 is 180.
package PrefixSum;

import java.util.Arrays;

public class Product_OfArray_ExceptSelf {
   static int[] prodexceptself(int[] arr){
        int zeros = 0, idx = -1, prod = 1;
        int n = arr.length;
        for (int i =0; i< n; i++){
            if (arr[i] == 0){
                zeros++;
                idx = i;
            }else{
                prod *= arr[i];
            }
        }
        int[] res = new int[n];
        Arrays.fill(res, 1);
        if (zeros ==0){
            for (int i =0; i< n; i++)
                res[i] = prod/ arr[i];
        } else if (zeros == 1)
            res[idx] = prod;
        return res;
    }
    public static void main(String[] args) {
        int [] arr = {10,3,5,6,2};
        int [] res = prodexceptself(arr);
        for (int val : res){
            System.out.print(val + " ");
        }
    }
}
