package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSets2 {

    public static List<List<Integer>> subsetsWithDup(int[] nums) {

        //pointer
        int p=0;
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> temp= new ArrayList<>();
        int n= nums.length;
        subset(nums,p,temp,ans);
        return ans;
    }

    public static void subset(int[] nums, int p,List<Integer> temp, List<List<Integer>> ans)
    {
        //base case
        ans.add(new ArrayList<>(temp));

        for(int i=p;i<nums.length;i++)
        {
            if(i!=p && nums[i]==nums[i-1]) continue;
            temp.add((Integer)nums[i]);
            subset(nums,i+1,temp,ans);
            temp.remove(temp.size()-1);
        }

    }

    public static void main(String[] a) {


        //long[] mat = {52244275, 123047899, 493394237, 922363607, 378906890, 188674257, 222477309, 902683641, 860884025, 339100162};

        int[] mat = {1,2,1};

        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(2);
        arr.add(3);
        int len= arr.size();
        List<List<Integer>> ans= new ArrayList<>();

        ans= subsetsWithDup(mat);
        // System.out.println("Optimal: "+ opt);
        //Arrays.stream(mat). forEach(e-> System.out.print(e + " ,"));
        for (List e:ans) {
            for (Object i:e) {
                System.out.print(i + " ,");
            }
            System.out.println();

        }
    }
}
