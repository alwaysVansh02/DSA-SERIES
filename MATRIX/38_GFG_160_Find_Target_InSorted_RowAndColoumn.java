package Matrices;
import java.util.*;
public class Search_In_RowAndColumn_Wise_TwoD_Array {
    static boolean matsearch(int[][]mat,int x){
        int n = mat.length, m = mat[0].length;
        int i=0, j = m - 1;
        while (i < n && j>=0){
            if (x > mat[i][j]){
                i++;
            } else if (x < mat[i][j]) {
                j--;
            }else
                return true;
        }
        return false; 
    }
    public static void main(String[] args) {
        int [][] mat = {{3,30,38},
                        {20,52,54},
                        {35,60,69}};
        int x = 35;
        System.out.println(matsearch(mat, x));
    }
}
