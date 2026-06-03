// You are given a matrix mat[][] of size n*m containing english alphabets and a string word. Check if the word exists on the mat[][] or not. The word can be constructed by using letters from adjacent cells, either horizontally or vertically. The same cell cannot be used more than once.
// Examples :
// Input: mat[][] = [['T', 'E', 'E'], ['S', 'G', 'K'], ['T', 'E', 'L']], word = "GEEK"
// Output: true
package RecursionAndBacktracking;

public class Word_Search_In4_Direction {
    static boolean isWordExist(char[][]mat, String word){
        int wlen = word.length();
        int n = mat.length;
        int m = mat[0].length;
        if (wlen > n * m)
            return false;
        for (int i =0; i< n;i++){
            for (int j = 0; j< m; j++){
                if (mat[i][j] == word.charAt(0)){
                    if (findMatch(mat,word,i,j,0))
                        return true;
                }
            }
        }
        return false;
    }
    static boolean findMatch(char[][] mat, String word, int x, int y, int widx){
        int wlen = word.length();
        int n = mat.length;
        int m = mat[0] . length;
        if (widx == wlen)
            return true;
        if (x<0 || y<0 || x>= n || y>= m)
            return false;
        if (mat[x][y] == word.charAt(widx)){
            char temp = mat[x][y];
            mat[x][y] = '#';
            boolean res = findMatch(mat,word,x-1,y,widx + 1)
                        ||  findMatch(mat,word, x +1, y, widx + 1)
                        || findMatch(mat, word, x, y- 1, widx +1)
                        || findMatch(mat,word,x, y +1, widx +1);
            mat[x][y] = temp;
            return res;
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] mat= {{'t', 'e','e'},{'s','g','k'},{'t','e','l'}};
        String word = "geek";
        System.out.println(isWordExist(mat,word));
    }
}
