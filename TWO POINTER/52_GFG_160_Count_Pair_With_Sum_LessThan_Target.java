package DSATWOPointerTechnique;

import java.util.Arrays;

public class Count_Pairs_With_Sum_Less_Target {
   static int countPairs(int[] arr, int target) {
        int cnt = 0;
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum < target) {
                cnt += right - left;
                left++;
            } else
                right--;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 8, 3, 4, 7, 6, 5};
        int target = 7;
        System.out.println("Count of pairs with sum less than target are: " + countPairs(arr, target));
    }

}

