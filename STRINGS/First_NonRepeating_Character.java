package BinarySearch_Problem;
public class solution {
    public char nonRepeatingChar(String s) {
        int freq[] = new int[26];
        char ch[] = s.toCharArray();
        for (char c : ch) {
            freq[c - 'a']++;
        }
            for (int i = 0; i < s.length(); i++) {
                if (freq[s.charAt(i) - 'a'] == 1) {
                    return s.charAt(i);
                }
            }
            return '$';
        }
        
    }
