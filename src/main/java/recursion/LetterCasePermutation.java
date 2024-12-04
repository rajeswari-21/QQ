package recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

    //using char array approach, better approach
    public static List<String> letterCasePermutationApr2(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s.toCharArray(), 0, result);
        return result;
    }

    private static void backtrack(char[] chars, int index, List<String> result) {
        if (index == chars.length) {
            result.add(new String(chars));
            return;
        }

        if (Character.isLetter(chars[index])) {
            chars[index] = Character.toLowerCase(chars[index]);
            backtrack(chars, index + 1, result);

            chars[index] = Character.toUpperCase(chars[index]);
            backtrack(chars, index + 1, result);
        } else {
            backtrack(chars, index + 1, result);
        }
    }

    public static List<String> letterCasePermutation(String s) {

        List<String> res =  new ArrayList();
        fun(s,0,new StringBuilder(),res);

        return res;
    }

    static void fun(String s, int indx, StringBuilder sb, List<String> res)
    {
        //each time sb same as size of input string s
        if(sb.length()==s.length())
        {
            res.add(new String(sb.toString()));
            return;
        }
        if(checkLetter(s.charAt(indx))){
            //lowerCase
            String temp= s.substring(indx,indx+1).toLowerCase();
            sb.append(temp.charAt(0));
            fun(s,indx+1,sb,res);
            sb.setLength(sb.length()-1);

            //upper case
            String temp1= s.substring(indx,indx+1).toUpperCase();
            sb.append(temp1.charAt(0));
            fun(s,indx+1,sb,res);
            sb.setLength(sb.length()-1);
        }
        else
        {
            // for non-alphabets
            sb.append(s.charAt(indx));
            fun(s,indx+1,sb,res);
            sb.setLength(sb.length()-1);
        }


    }

    static boolean checkLetter(char ch)
    {
        if(Character.isDigit(ch))
            return false;
        return true;
    }

    public static void main(String[] a) {

        List<String> ans = new ArrayList<>();

        ans = letterCasePermutation("a1b2");

        for (String e : ans) {

            System.out.print(e + " ,");
        }
        System.out.println();

    }
}
