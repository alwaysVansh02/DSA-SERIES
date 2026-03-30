package Hashing;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Group_Anagram_Together {
   public static ArrayList<ArrayList<String>> anagram(String[] arr){
       HashMap<String, ArrayList<String>> map = new HashMap<>();
       for (String word : arr){
           char[] ch = word.toCharArray();
           Arrays.sort(ch);
           String key = new String(ch);
           map.putIfAbsent(key, new ArrayList<>());
           map.get(key).add(word);
       }
       return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        ArrayList<ArrayList<String>> result = anagram(arr);
        System.out.println("Grouped Anagrams");
        for (ArrayList<String> group : result){
            System.out.println(group);
        }
    }
}
