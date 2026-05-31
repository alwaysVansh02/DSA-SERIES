// Given an incomplete Sudoku in the form of matrix mat[][] of order 9*9, the task is to solve the Sudoku. It is guaranteed that the input Sudoku will have exactly one solution.
// A sudoku solution must satisfy all of the following rules:
// Each of the digits 1-9 must occur exactly once in each row.
// Each of the digits 1-9 must occur exactly once in each column.
// Each of the digits 1-9 must occur exactly once in each of the 9, 3x3 sub-boxes of the grid.

//Aproach Using Backtracking in time--> O(9(n*n)) and space--> O(n)
package RecursionAndBacktracking;

public class Sudoku_Problem {
  static void solveSudoku(int[][] mat) {
        solveSudokuRec(mat, 0, 0);
    }

    static boolean solveSudokuRec(int[][] mat, int row, int col) {
        if (row == 8 && col == 9)
            return true; // base case
        if (col == 9) {
            row++;
            col = 0;
        }
        if (mat[row][col] != 0)
            return solveSudokuRec(mat, row, col + 1);
        for (int num = 1; num <= 9; num++){
            if (isSafe(mat,row,col, num)){
                mat[row][col] = num;
                if (solveSudokuRec(mat,row,col + 1))
                    return true;
                mat[row][col] = 0; // backtrack
            }
        }
        return false;
    }
    static boolean isSafe(int[][] mat, int row, int col,int num){
        for (int i =0; i < 9; i++)
            if (mat[row][i] == num)
                return false; // check if num exists in row
        for (int i = 0; i<9 ;i++)
            if (mat[i][col] == num)
                return false; // check if num exists in col
        // check if num exists in 3 * 3 sub boxes
        int sRow = row - (row % 3), sCol = col - (col % 3);
        for (int i =0 ; i< 3; i++)
            for (int j = 0; j< 3 ; j++)
                if (mat[i + sRow][j + sCol] == num)
                    return false;
        return true;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        solveSudoku(mat);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }

}
