package MostlyArray;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInString {


        static String solve(String s){
            int p1=s.length()-1;
            //int p2= s.length-1;
            List<String> tmp= new ArrayList();
            String res="";
            int i=0;
            while(p1>=0)
            {
                String temp="";
                while(p1>=0 && s.charAt(p1)!=' ')
                {
                    char ch= s.charAt(p1); //extracts each character
                    temp= ch+temp;
                    p1--;
                }
                res+=temp;
                if(p1>=0 && s.charAt(p1)==' ')
                {
                    res+=s.charAt(p1);
                    p1--;
                }



            }

            return res;
        }

    public static void main(String[] a) {

        System.out.println(solve("The fox"));

    }

}
