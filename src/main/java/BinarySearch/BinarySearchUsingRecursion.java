package BinarySearch;

public class BinarySearchUsingRecursion {

    static int search(int[] arr, int target)
    {
        return bs(arr,0,arr.length-1,target);
    }

    static int bs(int[] arr,int start, int end,int target)
    {
        if(start>end)
            return -1;
        int mid= (start+end)/2;
        if(arr[mid]==target)
            return mid;
        else if (arr[mid]<target)
            return bs(arr,mid+1,end,target);
        else
            return bs(arr,start,mid-1,target);

        }

        public static void main(String[] st)
        {
            int i[]= new int[]{-1,0,3,5,9,12};
            //int i[]= new int[]{1};
            System.out.println(search(i,9));
        }
    }

