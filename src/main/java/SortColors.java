import java.util.Arrays;

public class SortColors {

    public static void sortColors(int[] nums) {

        int[] freq= new int[3];
        int len= nums.length;
        for(int i=0;i<len;i++)
        {
            freq[nums[i]]++;
        }
        int k=0;
        for(int j=0;j<3;j++)
        {
            int temp= freq[j];
            while(temp>0)
            {
                nums[k]=j;
                temp--;
                k++;

            }

        }

    }

    public static void main(String[] a) {


        int[] mat = {1,2,1,1,0,2,0};
        //int[][] mat = {{0,1,2,0}, {3,4,5,2},{1,3,1,5}};
        //[0,1,2,0],[3,4,5,2],[1,3,1,5]


        sortColors(mat);
        // setZeroesOptimized(mat1);
        System.out.println("Optimized: ");
        Arrays.stream(mat). forEach(e-> System.out.print(e + " ,"));
        System.out.println();

    }
}
