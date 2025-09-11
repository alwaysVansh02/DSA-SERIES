//Given a string s, the objective is to convert it into integer format without
//utilizing any built-in functions. Refer the below steps to know about
//atoi() function.
//Cases for atoi() conversion:
//        1. Skip any leading whitespaces.
//        2. Check for a sign ('+' or '-'), default to positive if no sign is present.
//        3. Read the integer by ignoring leading zeros until a non-digit
//character is encountered or end of the string is reached. If no digits
//are present, return 0.
//        31
//        31
//        4. If the integer is greater than 2
//        — 1, then return 2
//        — 1 and if the
//31
//        31
//integer is smaller than -2 , then return -2
//Examples:
//Input: s — " 123
//Output: -123
//Explanation: It is possible to convert -123 into an integer so
//we returned in the form of an integer
package StringsGFG;

public class GFGImplementAtoi {

    public int myAtoi(String s) {

        // code here
        int sign = 1, res = 0, idx = 0;
        while (idx < s.length() && s.charAt(idx) == ' ') {
            idx++;
        }
        if (idx < s.length() && (s.charAt(idx) == '-' || s.charAt(idx) == '+')) {
            if (s.charAt(idx++) == '-') {
                sign = -1;
            }
        }
        while (idx < s.length() && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
            if (res > Integer.MAX_VALUE / 10 || (res > Integer.MAX_VALUE / 10 && s.charAt(idx) - '0' > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = 10 * res + (s.charAt(idx++) - '0');
        }
        return res * sign;
    }

    public static void main(String[] args) {
        GFGImplementAtoi obj = new GFGImplementAtoi();
        String s = "-42";
        System.out.println(obj.myAtoi(s));
    }
}

