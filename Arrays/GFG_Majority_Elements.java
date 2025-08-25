//Given an array arr[] consisting of n integers, the task is to find all the array
//        elements which occurs more than floor(n/3) times.
//        Note: The returned array of majority elements should be sorted.
//        Examples:
//        Input: arr[]
//        Output: [1, 2]
//        Explanation: The frequency of 1 and 2 is 3, which is more than
//        floor n/3 (8/3 = 2).

package ArrayGFG;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GFG_Majority_Elements {

        public ArrayList<Integer> findMajority(int[] arr) {
// Code here
            ArrayList<Integer> result = new ArrayList<>();
            int n = arr.length;
            int threshold = n / 3;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int num : arr) {
               map.put(num, map.getOrDefault(num ,0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > threshold) {
                    result.add(entry.getKey());
                }
            }
            Collections.sort(result);
            return result;
        }

    public static void main(String[] args) {
        GFG_Majority_Elements obj = new GFG_Majority_Elements();
        int[] arr = {2,2, 3, 1, 3, 2, 1, 1};
        System.out.println("Majority Elements more than n/3 times:" + obj.findMajority(arr));
    }
    }
