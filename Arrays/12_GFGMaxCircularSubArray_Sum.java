//ou are given a circular array arr[] of integers, find the maximum possible
//sum of a non-empty subarray. In a circular array, the subarray can start at
//the end and wrap around to the beginning. Return the maximum non-
//empty subarray sum, considering both non-wrapping and wrapping cases.
//Examples:
//Input: arro
//Output: 22
//Explanation:
//and moving
//= [8, -8, 9, -9, 10, -11, 12]
//Starting from the last element of the array, i.e, 12,
//in a circular fashion, we have max subarray as 12,
//        10, which gives maximum sum as 22.Y
package ArrayGFG;

public class GFGMaximumCircularSubArraySum {
    public int maxCircularSum(int arr[]){


    int totalSum = 0;
    int currMinSum = 0,currMaxSum =0;
    int maxSum = arr[0], minSum = arr[0];
for(int i=0 ;i< arr.length; i++) {
    currMaxSum = Math.max(currMaxSum + arr[i], arr[i]);
    maxSum = Math.max(maxSum, currMaxSum);
    currMinSum = Math.min(currMinSum + arr[i], arr[i]);
    minSum = Math.min(minSum, currMinSum);
    totalSum += arr[i];
}
        int normalSum = maxSum;
        int circularSum = totalSum - minSum;

        if(minSum == totalSum)
        return normalSum;
        return Math. max(normalSum, circularSum) ;
}

    public static void main(String[] args) {
        GFGMaximumCircularSubArraySum obj = new GFGMaximumCircularSubArraySum();
        int []arr = {8,-4,3,-5,4};
        System.out.println("Maximum Circular Subarray Sum is:" + obj.maxCircularSum(arr));
    }
    }
