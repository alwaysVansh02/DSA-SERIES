//    You are given an array arr[] of non-negative integers. You have to move all
//        the zeros in the array to the right end while maintaining the relative order
//        of the non-zero elements. The operation must be performed in place,
//        meaning you should not use extra space for another array.
//        Examples:
//        Input: arro
//        Output: [1, 2, 4, 3,
//        Explanation: There
//        are
//        three
//        0s that are moved to the end.
 
package ArrayGFG;
import java.util.Arrays;
public class GFGMoveAllZerosToEnd {

    void pushZerosToEnd(int[] arr) {
// code here
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        while (count < n) {
            arr[count] = 0;
            count++;
        }
    }

    public static void main(String[] args) {
        GFGMoveAllZerosToEnd obj = new GFGMoveAllZerosToEnd();
        int arr[] = {2,0,3,4,0,5,6,0};
         obj.pushZerosToEnd(arr);
        System.out.println("Arrays after push back all zeros:" + Arrays.toString(arr));
    }
}
