package recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {

        //swap numbers for position
    static List<List<Integer>> ans = new ArrayList<>();

    public static List<List<Integer>> pp(int[] arr) {

        recur(arr, 0, new ArrayList<Integer>());
        return ans;
    }

    public static void recur(int[] arr, int pos, List ds) {
        if (pos == arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = pos; i < arr.length; i++) {

                swap(arr,i,pos);
                ds.add((Integer)arr[pos]);
                //next position
                recur(arr, pos + 1, ds);
                ds.remove(ds.size() - 1);
                swap(arr,i,pos);

        }
    }

    public static void swap(int[] arr, int x, int y)
    {
        int temp= arr[x];
        arr[x]= arr[y];
        arr[y]= temp;
    }


    public static void main(String[] a) {


        int[] mat = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();

        List<List> ansOpt = new ArrayList<>();

        ans = pp(mat);
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
