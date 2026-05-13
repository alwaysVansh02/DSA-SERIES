package DSATWOPointerTechnique;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Count_Disti9nct_In_Window_SizeK {
  static ArrayList<Integer> countDistinct(int[] arr , int k){
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
     HashMap<Integer , Integer> freq = new HashMap<>();
     for (int i =0 ; i< k ; i++) {
         freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
     }
         res.add(freq.size());
         for (int j =k ; j<n ; j++) {
             freq.put(arr[j] , freq.getOrDefault(arr[j] , 0 ) + 1);
             freq.put(arr[j - k] , freq.get(arr[j - k]) - 1);
             if (freq.get(arr[j -k]) == 0){
                 freq.remove(arr[j - k ]);
             }
             res.add(freq.size());
         }
     
             return res;
 }
    public static void main(String[] args) {
        int[] arr = { 1,2,1,3,4,2,3};
        int k = 4;
        ArrayList<Integer> res = countDistinct(arr, k);
        for (int ele : res)
            System.out.print( ele  + " ");
    }
}
