//Given an array arr[l that contains positive and negative integers (may
//                                                                           contain O as well). Find the maximum product that we can get in a
//subarray of arr[].
//Note: It is guaranteed that the answer fits in a 32-bit integer.
//Examples
//= [-2, 6, -3, -10, o, 2]
//Input: arro
//Output: 180
//Explanation: The subarray with
//maximum product is [6, -10] with product = 6 * (-3) * (-10) = 180
// -3,
package ArrayGFG;

public class GFGMaximumProductSubArray {
   public int maxProduct(int[] arr) {
// code here
        int n = arr.length;
        int maxprod = arr[0];
        int minprod = arr[0];
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            if (current < 0) {
                int temp = maxprod;
                maxprod = minprod;
                minprod = temp;
            }
            maxprod = Math.max(current, maxprod * current);
            minprod = Math.min(current, minprod * current);
            result = Math.max(result, maxprod);
        }
                return result;
            }
    public static void main(String[] args) {
        GFGMaximumProductSubArray obj = new GFGMaximumProductSubArray();
        int[] arr = {-2,6,-3,-10,0,2};
        int result = obj.maxProduct(arr);
        System.out.println("Maximum product Subarray is:" + result);
    }

    }

