package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthLargestElementInArray {

    static int solve(int[]  nums,int k){


        int left=0; int right= nums.length-1;
        //check
        while(true){
            //get the pivot value index, note pivot value is at its correct indx
            // indx=2, so pivot is the (index+1)th i.e 3rd largest element
            int indx= quickSort(nums,left,right);

            //if pivot index is the kth largest element
            if(indx==k-1)
            {
                return nums[indx];
            }
            //if pivot index < the kth largest element, search in the right half
            if(indx < k-1)
                left=indx+1;
            //if pivot index is > the kth largest element indx(means pivot is smaller than Kth value),
            //search in the left half
            if(indx > k-1)
                right= indx-1;

        }


    }

    //quick sort
    static int quickSort(int[] arr,int left, int right){

        int pivot=arr[left];
        int l=left+1; int r=right;
        //descending order
        while(l<=r)
        {
            //check left & right, keep smallest to right
            if(arr[l]<pivot && arr[r]>pivot)
            {
                //swap
                int temp=arr[l];
                arr[l]= arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
            //if left > pivot, let it be in the left since desc
            else if(arr[l]>=pivot)
                l++;
            else if(arr[r]<=pivot)
                r--;
        }

        //swap pivot
        int temp2=arr[r];
        arr[r]=pivot;
        arr[left]=temp2;
        //retrun indx of pivot
        return r;

    }

    public static void main(String[] a) {


        int[] mat = {1,2,3,4,5,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,-5,-4,-3,-2,-1};
        //int[] mat = {2,1};

            System.out.print(solve(mat,20));


        }

    }

