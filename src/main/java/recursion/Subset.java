package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {


    public static void func(int[] arr, int indx,List ds,List<List<Integer>> ans){

        ans.add(new ArrayList<>(ds));
        for(int i=indx;i<arr.length;i++){

            ds.add(arr[i]);
            func(arr,i+1,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList();
       // fun(nums,new ArrayList(),0,ans);
        func(nums,0,new ArrayList(),ans);
        return ans;
    }

    static void fun(int[] arr, List ds, int indx, List<List<Integer>> ans){

        //base case
        if(indx==arr.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }


        //not pick
        fun(arr,ds,indx+1,ans);

        //pick
        ds.add((Integer)arr[indx]);
        fun(arr,ds, indx+1,ans);
        //back track
        ds.remove(ds.size()-1);

    }

    public static void main(String[] a) {


        int[] mat = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();

        List<List> ansOpt = new ArrayList<>();

        ans = subsets(mat);
        //ansOpt= combinationSum2Opt(mat,5);

        //Arrays.stream(mat). forEach(e-> System.out.print(e + " ,"));
        for (List e : ans) {
            System.out.print("[ ");
            for (Object i : e) {
                System.out.print(i +", ");
            }
            System.out.print("]");
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
