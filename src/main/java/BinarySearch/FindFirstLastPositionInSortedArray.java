package BinarySearch;

import java.util.Arrays;

public class FindFirstLastPositionInSortedArray {
    static int[] solve(int[]  input,int target){
        int len= input.length;
        int first=-1; int last=-1;
        int low1=0;
        int high1= len-1;
        //lower bound
        while(low1<=high1)
        {
            int mid= (low1+high1)/2;
            if(input[mid]==target)
            {
                first=mid;
                high1=mid-1;
            }
            else if(input[mid]>target)
                high1=mid-1;
            else
                low1=mid+1;
        }

        //upper bound
        int low=0;
        int high= len-1;
        while(low<=high)
        {
            int mid= (low+high)/2;
            if(input[mid]==target)
            {
                last=mid;
                low=mid+1;
            }
            else if(input[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }

        return new int[]{first,last};
    }

    public static void main(String[] z){

        //int i[]= new int[]{6, 5, 7, 7, 8, 8,10};
        int i[]= new int[]{1};
        Arrays.stream(solve(i,1)).forEach(x-> System.out.println(x));

    }

}
