import java.util.ArrayList;
import java.util.List;

public class CellsWithOddValue {


    static int solve(int n, int m, List<List<Integer>> input) {

        int row = n;
        int col = m;
        int[][] mat= new int[n][m];
        List<List<Integer>> arr = new ArrayList();
        int len = input.size();
        for (int i = 0; i < len; i++) {
            int j = 0;
            int ri = input.get(i).get(j);
            int ci = input.get(i).get(j + 1);

            incRi(ri, mat, col);
            incCi(ci, mat, row);

        }

        int count = oddCells(mat, row, col);
        return count;
    }

    static void incRi(int r, int[][] mat, int col) {
        //List<Integer> temp = input.get(r);
        for (int i = 0; i < col; i++) {
            int sum = mat[r][i] + 1;
            mat[r][i]=sum;

        }
       // input.set(r, temp);
    }

    static void incCi(int c,int[][] mat, int row) {

        for (int i = 0; i < row; i++) {
            //get the row
           // List<Integer> temp = input.get(i);

            //inc the col
            int sum = mat[i][c]+1;

            //set the row
            //input.set(i, temp);
            mat[i][c]=sum;

        }
    }

    static int oddCells(int[][] mat, int row, int col) {
        int count = 0;
        for (int i = 0; i < row; i++) {
            //List<Integer> temp = input.get(i);
            for (int j = 0; j < col; j++) {
                if (mat[i][j] % 2 != 0)
                    count++;
            }
        }

        return count;
    }

    public static void main(String[] a) {


        int[][] mat = {{0, 1}, {1, 1}};


        List<List<Integer>> matx = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                temp.add(j, mat[i][j]);

            }
            matx.add(temp);

        }

        int res = solve(2, 3, matx);
        System.out.print(res);
        System.out.println();

    }
}
