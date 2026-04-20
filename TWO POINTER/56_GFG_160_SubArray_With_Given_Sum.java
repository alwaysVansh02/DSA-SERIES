package DSATWOPointerTechnique;

import java.util.ArrayList;

public class SubArray_With_Given_Sum {
      ///  2. nd Aproach Sliding Window - O(n) Time and O(1) Space
  static ArrayList<Integer> subArraySum(int[] arr, int target) {
        int s = 0, e = 0; 
        ArrayList<Integer> res = new ArrayList<>();
        int curr = 0;
        for (int i = 0; i < arr.length; i++) {
            curr += arr[i];
            if (curr >= target) {
                e = i;
                while (curr > target && s < e) {
                    curr -= arr[s];
                    ++s;
                }
                if (curr == target) {
                    res.add(s + 1);
                    res.add(e + 1);
                    return res;
                }
            }
        }
        res.add(-1);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 8, 9, 5};
        int target = 23;
        ArrayList<Integer> res = subArraySum(arr, target);
        for (int ele : res)
            System.out.print(" The Required Subarray is " + ele + " ");
    }
    
}
