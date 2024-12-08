package Sorting;

public class InversionCountArray {
    static int cnt=0;
    static int count(int[]  input){

        int low=0, high=input.length-1;
        fun(input,low,high);
        return cnt;
    }

    static void fun(int[] arr, int low, int high){

        if(low==high)
            return;
        int mid= (low+high)/2;
        fun(arr,low,mid);
        fun(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    static void merge(int[] arr, int low,int mid,int high)
    {
        int p1=low, p2=mid+1; int[] temp= new int[arr.length]; int i=0;
        while(p1<=mid && p2<=high)
        {
            if(arr[p1]<=arr[p2])
            {
                temp[i]= arr[p1];
                i++;
                p1++;
            }
            else
            {   cnt+=(mid-p1)+1;
                temp[i]= arr[p2];
                i++;
                p2++;
            }
        }

        while(p1<=mid){
            temp[i]= arr[p1];
            i++;
            p1++;
        }

        while(p2<=mid){
            temp[i]= arr[p2];
            i++;
            p2++;
        }

        int j=0;
        while(j<i)
        {
            arr[low+j]= temp[j];
            j++;
        }
    }

    public static void main(String[] a) {


        int[] mat = {8, 4, 2, 1};
        //1,3,2,3,1
        //2147483647,2147483647,2147483647,2147483647,2147483647,2147483647
        //2147483647,2147483647,-2147483647,-2147483647,-2147483647,2147483647
        System.out.print(count(mat));


    }
}
