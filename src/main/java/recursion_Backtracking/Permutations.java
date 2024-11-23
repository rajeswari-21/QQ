package recursion_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    static List<List<Integer>> ans = new ArrayList<>();

    public static List<List<Integer>> permute(int[] nums) {

        recur(nums, 0, new ArrayList<Integer>());
        return ans;


    }

    public static void recur(int[] arr, int pos, List ds) {
        if (pos == arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = pos; i < arr.length; i++) {
            swap(arr, pos, i);
            ds.add((Integer) arr[pos]);
            recur(arr, pos + 1, ds);
            ds.remove(ds.size() - 1);
            swap(arr, pos, i);
        }
    }

    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void main(String[] a) {


        //int[] mat = {1, 2, 3};
        int[] mat= {4,0,1,2, 3};

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        int len = arr.size();
        List<List<Integer>> ans = new ArrayList<>();

        ans = permute(mat);

        for (List e : ans) {
            for (Object i : e) {
                System.out.print(i + " ,");
            }
            System.out.println();

        }
    }
}
