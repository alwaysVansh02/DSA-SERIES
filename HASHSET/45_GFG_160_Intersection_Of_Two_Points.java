package Hashing;

import java.util.*;

public class Imntersection_Of_Two_Arrays {
    static ArrayList<Integer> intersect(int[] a, int[] b){
        HashSet<Integer> sa = new HashSet<>();
        for (int num : a){
            sa.add(num);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int num : b){
            if (sa.contains(num)){
                res.add(num);
                sa.remove(num);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,2,2};
        int[] b = {3,2,2,3,3,2};
        ArrayList<Integer> res = intersect(a,b);
        for (int val : res){
            System.out.print(val + " ");
        }
    }
}
