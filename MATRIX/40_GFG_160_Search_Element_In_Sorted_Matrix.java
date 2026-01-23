package Matrices;

public class Search_Element_In_Sorted_Matrix {
   static boolean searchMatrix(int[][] mat , int x){
        int n = mat.length, m = mat[0].length;
        int lo =0, hi = n * m - 1;
        while (lo<= hi){
            int mid = (lo+hi)/2;
            int row = mid / m;
            int col = mid % m;
            if (mat[row][col] == x)
                return true;
            if (mat[row][col] < x)
                lo = mid +1;
            else
                hi = mid -1;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,5,9},
                   {14,20,21},
                   {30,34,43}};
       int x = 14;
       System.out.println(searchMatrix(mat, x) ? "true" : "false");
    }
}
