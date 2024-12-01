package recursion_Backtracking;

public class SudokuSolver {

    static char[][] board={{'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}};

    public static void solveSudoku(char[][] board) {

        solve(board);
    }
    public static boolean solve(char[][] board) {


        //traverse and check for empty space
        //row
        for(int i=0;i<board.length;i++)
        {
            //column
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='.')//check empty space
                {
                    for(int no=1;no<=9;no++)// from 1 to 9 numbers check each possibility
                    {
                        //check posibility
                        char ch=Character.forDigit(no, 10);
                        if(validCheck(board,i,j,ch))
                        {
                            board[i][j]=ch;
                            //with this above no in i,j position check next empty space
                            //and fill accordingly
                            //also by the end if no empty space we get true or if no num valid, get false
                            if(solve(board)== true)
                                return true;
                            else
                            {
                                //number assigned already, remove it as we could not
                                //go ahead with other combition with this option
                                board[i][j]='.';
                            }

                        }
                    }
                    // if no number is valid
                    return false;
                }

            }
        }
        //by the end if no empty space we return true
        return true;
    }

    public static boolean validCheck(char[][] board, int row, int col, int no)
    {

        for(int i=0;i<9;i++)
        {
            //row check
            if(board[i][col]==no)
                return false;

            //col check
            if(board[row][i]==no)
                return false;

            //matrix check
            if(board[3*(row/3) + i/3][3*(col/3) + i%3]==no)
                return false;
        }
        return true;

    }

    public static void main(String[] args){

        solveSudoku(board);
        for(int i=0;i<board.length;i++) {
            //column
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }


    }
}
