package Matrices;
import java.util.*;
public class Search_In_Sorted_Row_Wise_In_Matrix {
    ///  binary search use kar rhe h kiu ki sirf row wise sorted h matrix
    static boolean search(int[] arr, int x){
        int low = 0, high = arr.length-1;
        while (low<= high){
            int mid = low + (high - low)/2;
            if (arr[mid] == x)
                return true;
            if (x > arr[mid])
                low = mid +1;
            else
                high = mid- 1;
        }
        return false;
    }
    static boolean matSearch(int[][] mat, int x){
        int n = mat.length, m= mat[0].length;
        for (int i=0; i<n ; i++){
            if (search(mat[i] , x))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat ={{3,4,9},
                    {2,5,6},
                    {9,25,27}};
        int x = 9;
        if (matSearch(mat, x))
            System.out.println("Element found in the matrix");
        else
            System.out.println("Element not found in the matrix");
    }
}
