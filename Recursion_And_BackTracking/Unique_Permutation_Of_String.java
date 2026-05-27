// Given a string s, which may contain duplicate characters, your task is to generate and return an array of all unique permutations of the string. You can return your answer in any order.

// Examples:

// Input: s = "ABC"
// Output: ["ABC", "ACB", "BAC", "BCA", "CAB", "CBA"]
// Explanation: Given string ABC has 6 unique permutations.
package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Unique_permutation_Of_String {
     static ArrayList<String> findPermutation(String s){
       boolean[] used = new boolean[s.length()];
       HashSet<String> st = new HashSet<>();
       StringBuilder curr = new StringBuilder();
       genPermutation(0, s, used, curr, st);// recurion function ko call kie h
       return new ArrayList<>(st);
   }
   static void genPermutation(int i , String s, boolean[] used, StringBuilder curr, HashSet<String> st){
       if (i == s.length()){
           st.add(curr.toString());
           return;
       }
       for (int  j =0; j<s.length();j++){
           if ( !used[j]){
               used[j] = true;
               curr.append(s.charAt(j));
               genPermutation(i + 1, s, used, curr, st);// isme sirf recursion call kie h isi function me ans k lie
               // backtrack kr rhe h pichle wale charac ko unmark krte bhue taki dusre cover ho ske
               used[j] = false;
               curr.deleteCharAt(curr.length()-1);
           }
       }
   }

   public static void main(String[] args) {
       String s = "ABC";
       ArrayList<String> res = findPermutation(s);
       for(String perm : res){
           System.out.print(perm + " ");
       }
   }
}
