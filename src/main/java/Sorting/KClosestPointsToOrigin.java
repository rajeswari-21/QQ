package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KClosestPointsToOrigin {

    public static List<List<Integer>> solve(List<List<Integer>>  input, int k){

        Collections.sort(input,(a, b)->distance(a)-distance(b));

        return input.subList(0,k);

    }

    static int distance(List<Integer> point){
        return ((point.get(0)*point.get(0))+(point.get(1)*point.get(1)));
    }

    public static void main(String[] a) {


        int[][] mat = {{3,3},{5,-1},{-2,4}};
        List<List<Integer>> m= new ArrayList<>();
        for(int i=0;i<mat.length;i++)
        {
            List list= new ArrayList();
            for(int j=0;j<mat[0].length;j++)
            {
                list.add(mat[i][j]);
            }
            m.add(list);
        }
        //2,1,0,1,2

        m=solve(m,2);
        for(List<Integer> l:m)
        {
            for(int i:l)
            {
                System.out.print(i + ",");
            }
            System.out.println();
        }


    }
}
