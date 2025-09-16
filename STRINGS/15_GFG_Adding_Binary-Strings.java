//Given two binary strings sl and s2 consisting of only 0s and Is. Find the
//resultant string after adding the two Binary Strings.
//Note: The input strings may contain leading zeros but the output string
//should not have any leading zeros.
//Input: sl —
//        - "1101", s2 = "111"
//Output: 10100
//Explanation:
//        1101
//        10100
package StringsGFG;
      
public class GFGAddTwoBinaryString {
 
        public String addBinary(String s1, String s2) {

            StringBuilder result = new StringBuilder();
            int i = s1.length() - 1;
            int j = s2.length() - 1;
            int carry = 0;
            while (i >= 0 || j >= 0 || carry > 0) {
                int sum = carry;
                if (i >= 0) {
                    sum += s1.charAt(i) - '0';
                    i--;
                }
                if (j >= 0) {
                    sum += s2.charAt(j) - '0';
                    j--;
                }
                result.append(sum % 2);
                carry = sum / 2;
            }
            String ans = result.reverse().toString();
            int k = 0;
            while (k < ans.length() - 1 && ans.charAt(k) == '0') {
                k++;
            }
            return ans.substring(k);
        }
    public static void main(String[] args) {
        GFGAddTwoBinaryString obj = new GFGAddTwoBinaryString();
    String s1 = "1010" ;
    String s2 = "1011";
                    System.out.println(obj.addBinary(s1,s2));

    }
}
