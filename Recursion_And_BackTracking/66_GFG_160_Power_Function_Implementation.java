// Implement the function power(b, e), which calculates b raised to the power of e (i.e. be).

// Examples:

// Input: b = 3.00000, e = 5
// Output: 243.00000
package RecursionAndBacktracking;

public class Power_Function_Implementation {
//  Aproach divide and conquer methid in time--> O(log e) and space--> O(log e)
   static double power(double b, int e){
       if (e ==0)
           return 1;
       if (e < 0)
           return 1/ power(b, -e);
       double temp = power(b, e/2);
       if (e % 2 == 0)
           return temp * temp;
       else return b * temp * temp;
   }

   public static void main(String[] args) {
       double b = 3.00;
       int e = 5;
       double res = power(b, e);
       System.out.println(res);
   }
}
