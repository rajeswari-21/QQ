package recursion_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {

        int op = 0,cp=0;
       List<String> ans= new ArrayList<>();
        fun(op,cp,new StringBuilder(),ans, n);
        return ans;
    }

    public static void fun(int open, int close,StringBuilder ds, List<String> ans, int n){

        //base case
        if(open==close && open==n)
        {
            ans.add(ds.toString());
            return;
        }
        if(open<n)
        {
            char c='(';
            ds.append(c);
            fun(open+1,close,ds,ans,n);
            ds.setLength(ds.length()-1);
        }

        if(close<open)
        {
            char c=')';
            ds.append(c);
            fun(open,close+1,ds,ans,n);
            ds.setLength(ds.length()-1);
        }


    }

    public static void main(String[] a) {
  
        List<String> ans = new ArrayList<>();

        ans = generateParenthesis(2);

        for (String e : ans) {

                System.out.print(e + " ,");
            }
            System.out.println();

        }

    }

