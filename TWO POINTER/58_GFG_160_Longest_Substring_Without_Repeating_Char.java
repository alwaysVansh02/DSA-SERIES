//You are given a string s. You have to find the length of the longest substring with all distinct characters. 
// in Tine--> O(n) , Space--> O(1)
package DSATWOPointerTechnique;

public class Longest_Substring_Without_Repeating_Charc {
    static int longestUniqueSubstring(String s){
        int n = s.length();
        int res = 0;
        int[] lastindex = new int[26];
        for (int i = 0; i< n ; i++){
            lastindex[i] = -1;
        }
        int start =0;
        for (int end = 0; end < n ; end++){
            start = Math.max(start, lastindex[s.charAt(end) - 'a'] +1);
            res = Math.max(res , end - start + 1);
            lastindex[s.charAt(end) - 'a'] = end;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println("Length of the longest substring without repeating characters is: " + longestUniqueSubstring(s));
    }
}
