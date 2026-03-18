package Hashing;
    import java.util.Arrays;
    import java.util.Map;
import java.util.HashMap;

public class TwoSum_Count_Points_WithGiven_Sum {
   static int countPairs(int[] arr, int target) {
            Map<Integer, Integer> freq = new HashMap<>(); 
            int cnt = 0;

            for (int i = 0; i < arr.length; i++) {

                if (freq.containsKey(target - arr[i])) {
                    cnt += freq.get(target - arr[i]);
                }
                freq.put(arr[i], 
                        freq.getOrDefault(arr[i], 0) + 1);
            }
            return cnt;
        }

        public static void main(String[] args) {
            int[] arr = {1, 5, 7, -1, 5};
            int target = 6;
            System.out.println(countPairs(arr, target));
        }

    }


