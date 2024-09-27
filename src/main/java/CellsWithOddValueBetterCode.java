import java.util.ArrayList;
import java.util.List;

public class CellsWithOddValueBetterCode {



        public static int oddCells(int m, int n, int[][] indices) {
            int[] rows = new int[m];
            int[] cols = new int[n];
            int ans = 0;
            int count = 0;
            for (int[] x: indices) {
                rows[x[0]]++;
                cols[x[1]]++;
            }
            for (int x: rows) {
                if (x % 2 != 0) {
                    ans += n;
                    count++;
                }
            }
            for (int x: cols) {
                if (x % 2 != 0) {
                    ans += m-count*2;
                }
            }
            return ans;
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

        int res = oddCells(2, 3, mat);
        System.out.print(res);
        System.out.println();

    }
}
