package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthLargestElementInArray {

    static int solve(int[]  input,int k){


        Arrays.sort(input);
        int count=0;
        int i=input.length-1;
        int max= input[input.length-1];

        while(count!=k && i>=0)
        {
            if(max>=input[i])
            {
                max= input[i];
                count++;
            }
            i--;
            if(count==k)
                return max;
        }

        return max;
    }

    public static void main(String[] a) {


        //int[] mat = {3,2,3,1,2,4,5,5,6};
        int[] mat = {2,1};

            System.out.print(solve(mat,2));


        }

    }

