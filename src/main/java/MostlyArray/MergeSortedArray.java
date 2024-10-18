package MostlyArray;

import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int first=m-1;
        int second=0;
        //int len= nums1.length;

        // arrange all smaller elements in nums1 and bigger elements nums2 in
        while(first>=0 && second<n)
        {
            if(nums1[first]>nums2[second])
                swap(nums1,first,nums2,second);

            first-=1;
            second+=1;
        }

        //sort
        Arrays.sort(nums1,0,m);
        Arrays.sort(nums2);

        //arrange in one array
        int i=0;

        while(i<n)
        {
            nums1[m+i]= nums2[i];
            i++;
        }


    }

    public static void swap(int[] x1, int x, int[] y2, int y)
    {
        int temp= x1[x];
        x1[x] = y2[y];
        y2[y] = temp;
    }

    public static void main(String[] a) {


        int mat1[] = {1,2,3,0,0,0};
        int mat2[]= {2,5,6};
        //int[][] mat = {{0,1,2,0}, {3,4,5,2},{1,3,1,5}};
        //[0,1,2,0],[3,4,5,2],[1,3,1,5]


         merge(mat1,3,mat2,3);
        // setZeroesOptimized(mat1);
        System.out.println("Optimized: ");
        Arrays.stream(mat1). forEach(e-> {
            System.out.print(e + " ,");
        });
        System.out.println();

    }
}
