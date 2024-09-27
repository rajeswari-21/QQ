import java.util.ArrayList;
import java.util.List;

public class HollowSquareStarPattern {


        static List<String> solve(int n){

            List<String> res= new ArrayList<String>();
            for(int i=1;i<=n;i++)
            {
                String s="";
                for(int j=1;j<=n;j++)
                {
                    if((i!=1 && i!=n) && (j!=1 && j!=n))
                    {
                        s+=" ";
                        continue;
                    }
                    s+="*";
                }
                res.add(s);
            }

            return res;
        }

    public static void main(String[] a){

        List<String> res= solve(4);

        System.out.println(res);
    }

}
