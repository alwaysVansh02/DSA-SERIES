// The n-queens puzzle is the problem of placing n queens on a (n × n) chessboard such that no two queens can attack each other. Note that two queens attack each other if they are placed on the same row, the same column, or the same diagonal.
// Given an integer n, find all distinct solutions to the n-queens puzzle.
// You can return your answer in any order but each solution should represent a distinct board configuration of the queen placements, where the solutions are represented as permutations of [1, 2, 3, ..., n].
// In this representation, the number in the ith position denotes the column in which the queen is placed in the ith row.
// For eg. below figure represents a chessboard [2, 4, 1, 3]. 
//   Examples:
// Input: n = 1
// Output: [1]
// Explaination: Only one queen can be placed in the single cell available.

// Aproach Using Backtracking with Pruning in time--> O(n!) and space-->O(n)
package RecursionAndBacktracking;

import java.util.ArrayList;

public class N_Queen_Problem {
   static  ArrayList<ArrayList<Integer>> nQueen(int n){
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    ArrayList<Integer> board = new ArrayList<>();
    boolean[] rows = new boolean[n + 1];
    boolean[] diag1 = new boolean[2 * n + 1];
    boolean[] diag2 = new boolean[2 * n + 1];
    nQueenUtil(1, n, board, rows, diag1, diag2 ,res);
    return res;

    }
    static  void nQueenUtil(int j , int n, ArrayList<Integer> board, boolean[] rows,boolean[] diag1,
                            boolean[] diag2,ArrayList<ArrayList<Integer>> res ){
    if (j>n){ // base case
        res.add(new ArrayList<>(board));
        return;
    }
    for (int i = 1; i<= n; ++i){
        if ( !rows[i] && !diag1[i -j + n] && !diag2[i - j + n]){
            rows[i] = diag1[i + j] = diag2[ i- j + n] = true;
            board.add(i);
            nQueenUtil(j + 1, n , board, rows , diag1, diag2, res);
            // backtrack
            board.remove(board.size() - 1);
            rows[i] = diag1[i + j] = diag2[i - j + n] = false;
        }
    }
    }

    public static void main(String[] args) {
        int n = 4;
        ArrayList<ArrayList<Integer>> res = nQueen(n);
        for (ArrayList<Integer> row : res) {
            System.out.print(" [ ");
            for (int i = 0; i < row.size(); i++) {
                System.out.print(row.get(i));
                if (i != row.size() - 1)
                    System.out.print(" ");
            }
            System.out.println(" ] ");
    }
}
}
