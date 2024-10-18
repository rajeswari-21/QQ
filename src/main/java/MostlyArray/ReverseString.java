package MostlyArray;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {


        static String solve(String s) {
            int p1 = s.length() - 1;
            //int p2= s.length-1;
            List<String> tmp = new ArrayList();
            String res = "";
            int i = 0;
            while (i <= p1) {
                //List<String> t= new ArrayList();
                String tx = "";

                while (i <= p1 && s.charAt(i) != ' ') {
                    tx += s.charAt(i);
                    i++;
                }
                if(tx!="")
                    tmp.add(tx);
                i++;
            }

            for (int k = tmp.size() - 1; k >= 0; k--) {
                res += tmp.get(k);
                if (k != 0)
                    res += " ";
            }

            return res;

        }

    public static void main(String[] a) {

        System.out.println(solve(" The fox "));

    }

}
