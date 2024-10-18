package MostlyArray;

import java.util.ArrayList;
import java.util.List;

public class MatrixDiagonalSum {

    static int solve(List<List<Integer>>  input){

        int leno= input.size();
        int leni= input.get(0).size();
        int pd; int sd=leni-1;
        int sum=0;

        for(int i=0;i<leno;i++)
        {
            for(int j=0;j<leni;j++)
            {
                int temp= i+j;
                if(temp==0 || i==j)
                {
                    sum+=input.get(i).get(j);
                }
                if(temp==sd && i!=j)
                {
                    sum+=input.get(i).get(j);
                }
            }
        }
        return sum;
    }

    public static void main(String[] a){


        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};


        List<List<Integer>> matx= new ArrayList<>();
        for(int i=0;i<3;i++)
        {
            ArrayList<Integer> temp= new ArrayList<>();
            for (int j=0;j<3;j++)
            {
                temp.add(j,mat[i][j]);

            }
            matx.add(temp);

        }

        int res =solve(matx);
        System.out.print(res);
        System.out.println();
    }
}
