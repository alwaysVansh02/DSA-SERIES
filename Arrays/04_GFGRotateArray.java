//Given an array arr[). Rotate the array to the left (counter-clockwise
//        direction) by d steps, where dis a positive integer. Do the mentioned
//        change in the array in place.
//        Note: Consider the array as circular.
//        Examples :
//        Input: arr[]
//        Output: [3, 4, 5, 1, 2]
//        Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
package ArrayGFG;

import java.util.Arrays;

public class GFGRotateArray {

    // Function to rotate an array by d elements in counter-clockwise
    static void rotateArr(int arr[], int d) {
// add your code here
        int n = arr.length;
        d = d % n;
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }
            for (int i = 0; i < d; i++) {
                arr[n - d - i] = temp[i];

            }
        }

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        int d =2;
        System.out.println("Original Array:" + Arrays.toString(arr));
        rotateArr(arr,d);
        System.out.println("Rotated Array:"+ Arrays.toString(arr));
    }
    }


