package Sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CountOfSmallerNumbersAfterSelf {

    // int[] mat = {0,2,1};
    public static List<Integer> countSmaller(int[] nums) {

        List<Integer> ans= new ArrayList<>();
        List<Integer> sorted= new ArrayList<>();
        //int[] sorted= new int[nums.length];
        for(int i=nums.length-1;i>= 0;i--)
        {
            int count= placeinSortedArray(sorted,nums[i]);
            sorted.add(count,nums[i]);
            ans.add(count);
        }
        Collections.reverse(ans);
        return ans;

    }
    static  int placeinSortedArray(List<Integer> sorted, int i){
        if(sorted.isEmpty())
        {
            return 0;
        }
        int low=0,high=sorted.size()-1,temp=0;
        while(low<=high)
        {
            int mid= (low+high)/2;
            if(i<=sorted.get(mid))
            {
                 temp= mid;
                high= mid-1;
            }
            else
            {
                low=mid+1;
                temp=mid+1;
            }
        }
        return temp;
    }

    /*static int[] ans;
    public static List<Integer> countSmaller(int[] nums) {
        ans= new int[nums.length];
        fun(nums,0,nums.length-1);
        List<Integer> res= new ArrayList<Integer>();
        for(int i:ans)
        {
            res.add(i);
        }
        return res;
    }
    static void fun(int[] arr, int low, int high)
    {
        if(low>=high)return;
        int mid=(low+high)/2;
        fun(arr,low,mid);
        fun(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    static void merge(int[] arr, int low, int mid, int high)
    {
        int p1=low, i=0; int p2=mid+1; int[] temp= new int[arr.length];
        while(p1<=mid && p2<=high)
        {
            if(arr[p1]>arr[p2])
            {
                //add all numbers from p2 to high, if p2 is smaller then
                //after p2 everything will be smaller as arr is in desc order
                int count= ans[p1]+ (high-p2)+1;
                ans[p1]=count;
                //desc order
                temp[i] = arr[p1];
                p1++; i++;

            }
            else //p1<p2 or p1==p2
            {
                //desc order
                temp[i] = arr[p2];
                p2++; i++;
            }

        }

        while(p1<=mid)
        {
            temp[i]=arr[p1];
            i++;p1++;
        }
        while(p2<=high)
        {
            temp[i]=arr[p2];
            i++;p2++;
        }
        int j=0;
        while(j<i)
        {
            arr[low+j]= temp[j];
            j++;
        }
    }*/

    public static void main(String[] a) {


        int[] mat = {0,2,1};
        //1,3,2,3,1
        //2147483647,2147483647,2147483647,2147483647,2147483647,2147483647
        //2147483647,2147483647,-2147483647,-2147483647,-2147483647,2147483647
        System.out.print(countSmaller(mat));


    }
}
