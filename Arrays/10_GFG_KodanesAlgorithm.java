//You are given an integer array arr[]. You need to find the maximum sum of
//a subarray (containing at least one element) in the array arr[].
//Note : A subarray is a continuous part of an array.
//        Examples:
//Input: arr[]
//Output: 11
//Explanation: The subarray [7,
//        -1, 2, 3] has the largest sum 11.
package ArrayGFG;

public class GFGMaximumSubArraySum {

        int maxSubarraySum(int[] arr) {
// Code here
            int maxSum = arr[0];
            int currentSum = arr[0];
            for (int i = 0; i < arr.length; i++) {
                currentSum = Math.max(arr[i], currentSum + arr[i]);
                maxSum = Math.max(maxSum, currentSum);
            }
            return maxSum;
        }
    public static void main(String[] args) {
        int arr[] = {2,-2,3,4,5,-6};
        GFGMaximumSubArraySum obj = new GFGMaximumSubArraySum();
        System.out.println("Maximum SubArray Sum is:" + obj.maxSubarraySum(arr));
    }
}
