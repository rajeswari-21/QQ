package Sorting;

import java.util.ArrayList;

public class ReversePairs {
    static int count=0;
    public static int reversePairs(int[] nums) {


        int low=0;
        int high= nums.length-1;
        recur(nums,low,high);//recur(nums,low,high);
        return count;

    }

    static void recur(int[] arr, int l, int r)
    {
        int count=0;
        //basecase
        if(l>=r)return;
        int mid=(l+r)/2;
        recur(arr,l,mid);
        recur(arr,mid+1,r);
        countPairs(arr,l,mid,r);
        merge(arr,l,mid,r);
       //count;

    }

    static void countPairs(int[] arr, int l, int mid, int r)
    {
        int p2=mid+1;
        // traversal through 1st array
        int tempCount=0;
        for(int p1=l;p1<=mid;p1++)
        {   // traverse through 2nd array & check the condition

                while (p2 <= r)
                {
                    if((long) arr[p1] > (long)2 * arr[p2]) {
                        p2++;
                        tempCount++;
                    }
                    else break;
                }
                if(tempCount>0)
                    count += (p2 - (mid + 1));


        }
      //return count;
    }
    static void merge(int[] arr, int l, int mid, int r){
        int p1=l; int p2= mid+1; int[] temp= new int[arr.length]; int i=0;
        while(p1<=mid && p2<=r)
        {
            if(arr[p1]<=arr[p2])
            {
                temp[i]=arr[p1];
                i++;
                p1++;
            }
            else
            {
                temp[i]=arr[p2];
                i++;
                p2++;

            }
        }

        while(p1<=mid)
        {
            temp[i]=arr[p1];
            i++;
            p1++;
        }

        while(p2<=r)
        {
            temp[i]=arr[p2];
            i++;
            p2++;
        }
        int j=0;
        while(j<i)
        {
            arr[l+j]= temp[j];
            j++;
        }

    }




    public static void main(String[] a) {


        int[] mat = {1,3,2,3,1};
        //1,3,2,3,1
        //2147483647,2147483647,2147483647,2147483647,2147483647,2147483647
        //2147483647,2147483647,-2147483647,-2147483647,-2147483647,2147483647
        System.out.print(reversePairs(mat));


    }
}
