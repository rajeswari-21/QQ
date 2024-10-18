package MostlyArray;

import java.util.Arrays;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {

        // find the breakpoint;
        int bp= -1;
        int len= nums.length;
        for(int i=len-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                bp=i;
                break;
            }
        }
        //already the largest and last permutation number
        if(bp==-1)
            reverse(0,len-1,nums);

        else {
            // find the replacement of breakpoint & swap
            for (int j = len - 1; j >= 0; j--) {
                if (nums[j] > nums[bp]) {
                    swap(j, bp, nums);
                    break;
                }
            }

            //sort rest of the numbers after bp
            if (bp < len - 1)
                reverse(bp + 1, len - 1, nums);
            //return nums;
        }
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void reverse(int start, int end, int[] arr)
    {
        while(start<end)
        {
            swap(start,end,arr);
            end--;
            start++;
        }
    }

    public static void swap(int i, int j, int[] arr)
    {
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }

    public static void main(String[] a) {


        int[] mat = {1,2,3};
        //int[][] mat = {{0,1,2,0}, {3,4,5,2},{1,3,1,5}};
        //[0,1,2,0],[3,4,5,2],[1,3,1,5]


        nextPermutation(mat);
       // setZeroesOptimized(mat1);

        System.out.println("Optimized: ");

        Arrays.stream(mat). forEach(e-> System.out.print(e + " ,"));

            System.out.println();




    }
}
