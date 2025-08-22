//You are given an array of integers arr[]. You have to reverse the given array.
//        Note: Modify the array in place.
//        Examples:
//        Input: arr —
//        Output: [5, 6, 2, 3, 4, 1]
//        Explanation: The elements of
//        After reversing the array, the
//        position, the second element
//        so on. Hence, the answer is
//        the array are [1, 4, 3, 2, 6, 5].
//        first element goes to the last
//        goes to the second last position and

package ArrayGFG;

import java.util.Arrays;

public class GFGReverseAmArray {

        public void reverseArray(int arr[]) {
// code here
            int n = arr.length;
            for (int i = 0; i < n / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[n - 1 - i];
                arr[n - 1 - i] = temp;
            }
        }

    public static void main(String[] args) {
        GFGReverseAmArray obj = new GFGReverseAmArray();
        int [] arr = {1,2,3,4,5};
        obj.reverseArray(arr);
        System.out.println("Rversed array:" + Arrays.toString(arr));
    }
    }
