//Given an array of integers arr[] representing a permutation, implement
//        the next permutation that rearranges the numbers into the
//        lexicographically next greater permutation. If no such permutation exists,
//        rearrange the numbers into the lowest possible order (i.e., sorted in
//        ascending order).
//        Note: A permutation of an array of integers refers to a specific arrangement
//        of its elements in a sequence or linear order.
//        Examples:
//        Input: arr[]
//        Output: [2, 4, 5, O, 1, 7]
//        Explanation: The next permutation of the given array is [2, 4, 5,
package ArrayGFG;
  
import java.util.Arrays;

import static java.util.Collections.swap;

public class GFGNextPermutattion {
    void nextpermutation(int[] arr){
        int n = arr.length;
        int i = n-2;
        while(i>=0 && arr[i]>= arr[i+1]){
            i--;

        }
        if(i>=0) {
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            swap(arr, i, j);
        }
        reverse(arr, i+1, n-1);
    }
   public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
   }
   public void reverse(int [] arr, int i , int j  ){
        while(i<j){
        swap(arr,i , j);
        i++;
        j--;
        }
   }

    public static void main(String[] args) {
        GFGNextPermutattion obj = new GFGNextPermutattion();
        int[] arr = {1,2,3};
        System.out.println("Original Array:"+ Arrays.toString(arr));
        obj.nextpermutation(arr);
        System.out.println("Next Permutationis:" + Arrays.toString(arr));
    }
}
