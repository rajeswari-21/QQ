package BinarySearch;

import java.util.Arrays;

public class FindFirstLastPositionInSortedArray {
    static int[] solve(int[]  nums,int target){
        int len= nums.length;
        int ans=search(nums,0,len-1,target);
        if(ans!=-1)
        {
            if(ans!=len-1 && nums[ans+1]==target)
                return new int[]{ans,ans+1};
            else if(ans!=0 && nums[ans-1]==target)
                return new int[]{ans-1,ans};
            else
                return new int[]{ans};
        }
        else
            return new int[]{ans,ans};
    }

    static int search(int[] arr,int start, int end,int target){

        if(start>end)
            return -1;
        int mid= (start+end)/2;
        if(arr[mid]==target)
            return mid;
        else if(arr[mid]<target)
            return search(arr,mid+1,end,target);
        else
            return search(arr,start,mid-1,target);
    }

    public static void main(String[] z){

        //int i[]= new int[]{6, 5, 7, 7, 8, 8,10};
        int i[]= new int[]{1};
        Arrays.stream(solve(i,1)).forEach(x-> System.out.println(x));

    }

}
