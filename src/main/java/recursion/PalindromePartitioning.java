package recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    static List<List<String>> ans = new ArrayList<>();

    public static List<List<String>> pp(String s) {

        recur(s, 0, new ArrayList<String>());
        return ans;
    }

    public static void recur(String s, int indx, List ds) {
        if (indx == s.length()) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = indx; i < s.length(); i++) {
            if (isPallindrome(s, indx, i)) {
                ds.add(s.substring(indx,i+1));
                recur(s, i + 1, ds);
                ds.remove(ds.size() - 1);
            }
        }
    }

    public static boolean isPallindrome(String str, int start, int end) {
        while (start <= end) {
            if (str.charAt(start++) != str.charAt(end--))
                return false;
        }
        return true;
    }

    public static void main(String[] a) {


        String str = "aab";

        List<List<String>> ans = new ArrayList<>();

        List<List> ansOpt = new ArrayList<>();

        ans = pp(str);
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
