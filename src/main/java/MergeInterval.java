import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {

    public static int[][] merge(int[][] intervals) {


        if (intervals.length == 1) {
            return intervals;
        }
        //sort the array
        Arrays.sort(intervals , new Comparator<int[]>(){
            public int compare(int[] a, int[] b)
            {
                return a[0] -b[0];
            }
        });

        List<List<Integer>> ans = new ArrayList<>();
        int len= intervals.length;
        for(int i=0;i<len;i++)
        {
            //when array is empty or a new interval need to be considered
            if(ans.isEmpty() || intervals[i][0]> ans.get(ans.size()-1).get(1))
            {
                // List temp= new ArrayList<Integer>();
                ans.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            }
            else{

                ans.get(ans.size()-1).set(1, Math.max(ans.get(ans.size()-1).get(1),intervals[i][1]));
            }
        }
        int arr[][] = new int[ans.size()][2];
        int y=0;
        for(List x: ans)
        {

            arr[y][0]= (int) x.get(0);
            arr[y][1]= (int) x.get(1);
            y++;

        }
        return arr;
    }

    public static void main(String[] a) {


        int mat[][] = {{1,3},{2,6},{8,9},{15,18}};
        //int[][] mat = {{0,1,2,0}, {3,4,5,2},{1,3,1,5}};
        //[0,1,2,0],[3,4,5,2],[1,3,1,5]


        int[][] arr= merge(mat);
        // setZeroesOptimized(mat1);
        System.out.println("Optimized: ");
        Arrays.stream(arr). forEach(e-> {
            for (int i:e
            ) {
                System.out.print(i + " ,");

            }
        });
        System.out.println();

    }
}
