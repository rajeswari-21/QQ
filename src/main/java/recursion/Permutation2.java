package recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation2 {

    static List<List<Integer>> solve(int[]  input){

        List<List<Integer>> ans= new ArrayList();
        fun(input,new ArrayList(),0,ans);
        return ans;
    }

    static void fun(int[]  input, List<Integer> ds, int indx, List<List<Integer>> ans)
    {
        //base case
        if(indx==input.length)
        {
            ans.add(new ArrayList(ds));
            return;
        }
        for(int i=indx;i<input.length;i++)
        {
            if(i!=indx && input[i]==input[i-1]) continue;
            swap(input,i,indx);
            ds.add(input[indx]);// position is indx, that stays constant, we swap nums i--> n to inx place and put in the ds
            fun(input,ds,indx+1,ans);
            swap(input,i,indx);
            ds.remove(ds.size()-1);

        }
    }

    static void swap(int[]  input,int x,int y){

        int temp= input[x];
        input[x]= input[y];
        input[y]= temp;
    }

    public static void main(String[] a) {


        int[] mat = {1,1,0,0};
        //1,2,3
        //1,1,2
        List<List<Integer>> ans = new ArrayList<>();

        List<List> ansOpt = new ArrayList<>();

        ans = solve(mat);
        //ansOpt= combinationSum2Opt(mat,5);

        //Arrays.stream(mat). forEach(e-> System.out.print(e + " ,"));
        for (List e : ans) {
            for (Object i : e) {
                System.out.print(i + " ,");
            }
            System.out.println();

        }

       /* System.out.println("Optimal: ");

        for (List e : ansOpt) {
            for (Object i : e) {
                System.out.print(i + " ,");
            }
            System.out.println();

        }*/
    }
}
