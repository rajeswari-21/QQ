package recursion;

import java.util.*;

public class CombinationSum2 {

    static List<List> ans = new ArrayList<>();
    static HashSet<List> set= new HashSet();

    //brut force
    public static List<List> combinationSum2(int[] candidates, int target) {

        List<Integer> ds = new ArrayList<Integer>();
        int p = 0;
        Arrays.sort(candidates);
        recur(candidates, p, target, ds);
        ans= set.stream().toList();
        return ans;
    }

    public static void recur(int[] arr, int p, int target, List<Integer> ds) {
        //base case
        if (p >= arr.length) {
            if (target == 0)
            {
                Collections.sort(ds);
                set.add(new ArrayList<>(ds));//ans.add(new ArrayList<>(ds));
            }

            return;
        }

        //picked
        if (arr[p] <= target) {
            ds.add((Integer) arr[p]);
            recur(arr, p + 1, target - arr[p], ds);
            ds.remove(ds.size()-1);
            //p-=1;
        }
        //not picked
        recur(arr, p + 1, target, ds);
    }

    //optimised
    public static List<List> combinationSum2Opt(int[] candidates, int target) {

        List<Integer> ds= new ArrayList<Integer>();
        int p=0;
        Arrays.sort(candidates);
        recur(candidates,p,target,ds);
        return ans;
    }

    public static void recurOpt(int[] arr,int p,int target,List<Integer> ds)
    {
        //base case
        if(target==0)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }


        for(int i=p;i<arr.length;i++)
        {
            if(i>p && arr[i]== arr[i-1]) continue;
            if(target< arr[i]) break;
            ds.add((Integer)arr[i]);
            recurOpt(arr,i+1,target-arr[i],ds);
            ds.remove(ds.size()-1);
        }

    }

    public static void main(String[] a) {


        //long[] mat = {52244275, 123047899, 493394237, 922363607, 378906890, 188674257, 222477309, 902683641, 860884025, 339100162};

        //int[] mat = {10, 1, 2, 7, 6, 1, 5};
        int[] mat = {2,5,2,1,2};

        List<List> ans = new ArrayList<>();

        List<List> ansOpt = new ArrayList<>();

        ans = combinationSum2(mat, 5);
        ansOpt= combinationSum2Opt(mat,5);

        //Arrays.stream(mat). forEach(e-> System.out.print(e + " ,"));
        for (List e : ans) {
            for (Object i : e) {
                System.out.print(i + " ,");
            }
            System.out.println();

        }

         System.out.println("Optimal: ");

        for (List e : ansOpt) {
            for (Object i : e) {
                System.out.print(i + " ,");
            }
            System.out.println();

        }
    }
}
