package Hashing;

import java.util.HashSet;
public class Two_pair_With_Sum {
   static  boolean twoSum(int[] arr, int target){
         HashSet<Integer> set = new HashSet<>();
         for (int i =0; i<arr.length; i++){
         int compliment = target - arr[i];
             if (set.contains(compliment)){
                 return  true;
             }
             set.add(arr[i]);
         }
         return  false;
     }

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, -8};
        int target = 16;
        if (twoSum(arr, target)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
