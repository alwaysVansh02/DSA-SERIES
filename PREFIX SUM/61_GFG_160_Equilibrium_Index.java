// Given an array of integers arr[], the task is to find the first equilibrium point in the array.
// The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements before that index is the same as the sum of elements after it.
// Return -1 if no such point exists.
package PrefixSum;

public class equilibrium_index {
  static int equipoint(int[] arr){
        int prefSum =0 , total = 0;
        for (int ele : arr){
            total += ele;
        }
        for (int pivot  =0; pivot< arr.length; pivot++){
            int suffSum = total - prefSum - arr[pivot];
            if (prefSum ==suffSum){
                return pivot;
            }
            prefSum += arr[pivot];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { -7,1,5,2,-4,3,0};
        System.out.println(equipoint(arr));
    }
}
