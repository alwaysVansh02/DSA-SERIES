package Hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class Union_Of_Two_Arrays {
  static ArrayList<Integer> findunion(int[] a , int[] b){
        HashSet<Integer> st = new HashSet<>();
        for (int num : a)
            st.add(num);
        for (int num : b)
            st.add(num);
        ArrayList<Integer> res = new ArrayList<>();
        for (int it : st)
            res.add(it);
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,2,1};
        int[] b= {3,2,2,3,3,2};
       System.out.println("The union of two arrays are" + findunion(a,b));
    }
}
