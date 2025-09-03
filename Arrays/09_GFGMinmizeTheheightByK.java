
//Given an array arr[l denoting heights of n towers and a positive integer k.
//        For each tower, you must perform exactly one of the following operations exactly once.
//        • Increase the height of the tower by k
//        • Decrease the height of the tower by k
//        Find out the minimum possible difference between the height of the shortest and
//        tallest towers after you have modified each tower.
//        You can find a slight modification of the problem here.
//        Note: It is compulsory to increase or decrease the height by k for each tower. After the
//        operation, the resultant array should not contain any negative integers.
//        Examples :
//        Input: k = 2, arro = [1, 5,
//        Output: 5
//        Explanation: The array can
//        8]. The difference between
//        8, 10]
//        be modified
//        the largest
//        as [1+k,
//        and the
//        5-k, 8-k, Io-kl = [3, 3, 6,
//        smallest is 8
package ArrayGFG;

import java.util.Arrays;

public class GFGMininmizeTheheightByK {

    public static int getMinDiff(int[] arr, int k) {
// code here
        int n = arr.length;
        Arrays.sort(arr);
        int res = arr[n - 1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - k < 0)
                continue;
            int minH = Math.min(arr[0] + k, arr[i] - k);
            int maxH = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            res = Math.min(res, maxH - minH);
        }
        return res;
    }

    public static void main(String[] args) {
        int k = 6;
        int[] arr = {12, 6, 4, 15, 17, 10};
        int ans = getMinDiff(arr, k);
        System.out.println(ans);
    }
}
