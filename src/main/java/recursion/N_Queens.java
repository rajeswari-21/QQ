package recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.StreamSupport;


/*Input: n = 4
        Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
        Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above*/
public class N_Queens {

    static List<List<String>>  chess = new ArrayList<List<String>>();

    static  List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                board[i][j] = '.';
            }
        }
        //freq arrays
        int[] leftRow= new int[n];
        int[] lowerDiagonal= new int[2*n-1];
        int[] upperDiagonal= new int[2*n-1];

        recur(0, board, leftRow,lowerDiagonal,upperDiagonal);
        return chess;

    }

     static List<List<String>> recur(int col, char[][] board, int[] leftRow, int[] lDiagonal, int[] uDiagonal) {

        //when all columns have 1 queen, hence col reach n size
        if (col == board.length) {
            chess.add(construct(board));
            return chess;
        }

        //each row check and fill Q for a col
        for (int row = 0; row < board.length; row++) {

            //check if it is safe to fill the Queen
            if (leftRow[row] ==0 && lDiagonal[row+col]==0 && uDiagonal[board.length - 1 + col - row]==0) {
                board[row][col] = 'Q';
                leftRow[row]=1;
                lDiagonal[row+col]=1;
                uDiagonal[board.length - 1 + col - row]=1;
                recur(col+1,board,leftRow,lDiagonal,uDiagonal);
                board[row][col]='.';  // remove the inserted Q
                leftRow[row]=0;
                lDiagonal[row+col]=0;
                uDiagonal[board.length - 1 + col - row]=0;
            }
        }
        return null;
    }

    static List<String> construct(char[][] board) {
        List<String> res = new LinkedList<String>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;

    }


    public static void main(String [] s){

        int n=4;
        solveNQueens(n);

        for(List<String> x:chess)
        {
            for(String str:x)
            {
                System.out.print(str +" ,");
                System.out.println();
            }
            System.out.println("Second Option");
            System.out.println();

        }
    }
}
