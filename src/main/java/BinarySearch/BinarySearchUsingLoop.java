package BinarySearch;

import java.util.Arrays;

public class BinarySearchUsingLoop {

    public static int search(int[] nums, int target) {

        int start=0;
        int end= nums.length-1;
        while(start<=end)
        {
            int mid= (start+end)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) end=mid-1;
            else start=mid+1;
        }

        return -1;
    }

    public static void main(String[] z){

        int i[]= new int[]{-1,0,3,5,9,12};
        //int i[]= new int[]{1};
        System.out.println(search(i,9));

    }
}
