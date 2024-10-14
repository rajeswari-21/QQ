package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetSum {

    public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        // code here
        ArrayList<Integer> ans= new ArrayList<Integer>();
        int sum=0;
        int p=0;
        subset(arr,sum,p,ans,n);
        return ans;
    }

    public static void subset(ArrayList<Integer> arr, int sum, int p, ArrayList<Integer> ans, int n)
    {

        if(p==n)
        {
            ans.add(sum);
            return;
        }

        subset(arr,sum+arr.get(p),p+1,ans,n);
        subset(arr,sum,p+1,ans,n);
    }

    public static void main(String[] a) {


        //long[] mat = {52244275, 123047899, 493394237, 922363607, 378906890, 188674257, 222477309, 902683641, 860884025, 339100162};

       // long[] mat = {1,2,1};

        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(2);
        arr.add(3);
        int len= arr.size();
        ArrayList<Integer> ans= new ArrayList<>();

        ans= subsetSums(arr,len);
       // System.out.println("Optimal: "+ opt);
        //Arrays.stream(mat). forEach(e-> System.out.print(e + " ,"));
        ans.stream().forEach(e-> System.out.print(e + " ,"));

    }
}
