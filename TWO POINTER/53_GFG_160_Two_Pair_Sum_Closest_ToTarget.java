package DSATWOPointerTechnique;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Two_Pair_Sum_Closest_ToTarget {
   static  ArrayList<Integer> sumClosest(int[] arr, int target){
        int n = arr.length;
        Arrays.sort(arr);
        ArrayList<Integer> res = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        int left= 0, right = n - 2;
        while (left < right){
            int currSum = arr[left] + arr[right];
            int currDiff = Math.abs(target - currSum);
            if (currDiff < minDiff){
                minDiff = currDiff;
                res = new ArrayList<>(Arrays.asList(arr[left], arr[right]));
            }
            if (currSum == target)
                return new ArrayList<>(Arrays.asList(arr[left], arr[right]));
                else if (currSum < target)
                    left++;
                else
                    right--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,7,1,4};
        int target = 10;
        ArrayList<Integer> res = sumClosest(arr,target);
        if (! res.isEmpty())
            System.out.println(res.get(0)+ " " + res.get(1));
    }
}
