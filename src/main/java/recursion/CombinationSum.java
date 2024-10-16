package recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    static List<List<Integer>> ans = new ArrayList<>();

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        if (candidates.length == 1) {

            if (candidates[0] == target) {
                ans.add(new ArrayList<>((Integer) candidates[0]));
                return ans;
            } else
                return ans;
        }

        //List<List<Integer>> ans= new ArrayList<>();
        List<Integer> ds = new ArrayList<Integer>();
        int p = 0;
        recur(candidates, p, target, ds);

        return ans;
    }

    public static void recur(int[] arr, int p, int target, List<Integer> ds) {
        //base case
        if (p == arr.length) {
            if (target == 0)
                ans.add(new ArrayList<>(ds));
            return;
        }

        if (target >= arr[p]) {
            //picked same index
            ds.add((Integer) arr[p]);
            recur(arr, p, target - arr[p], ds);

            //backtrack
            ds.remove(ds.size() - 1);
        }
        //not picked
        recur(arr, p + 1, target, ds);
    }

    public static void main(String[] a) {


        //long[] mat = {52244275, 123047899, 493394237, 922363607, 378906890, 188674257, 222477309, 902683641, 860884025, 339100162};

        int[] mat = {2, 3, 6, 7};

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        int len = arr.size();
        List<List<Integer>> ans = new ArrayList<>();

        ans = combinationSum(mat, 7);
        // System.out.println("Optimal: "+ opt);
        //Arrays.stream(mat). forEach(e-> System.out.print(e + " ,"));
        for (List e : ans) {
            for (Object i : e) {
                System.out.print(i + " ,");
            }
            System.out.println();

        }
    }
}
