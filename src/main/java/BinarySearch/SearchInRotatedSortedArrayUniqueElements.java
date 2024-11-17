package BinarySearch;

public class SearchInRotatedSortedArrayUniqueElements {

    static int solve(int[]  input,int target){

        int low=0;
        int high=input.length-1;
        while(low<=high)
        {
            int  mid= (low+high)/2;
            if(target==input[mid])
                return mid;
            //left half is sorted
            else if(input[low]<=input[mid])
            {
                //check if target is in the range of sorted array
                if(target>=input[low] && target<input[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }
            //right half is sorted
            else {
                //check if target is within the range of sorted half
                if(target>input[mid] && target<=input[high])
                    low=mid+1;
                else
                    high=mid-1;

            }


        }
        return -1;
    }

    public static void main(String[] z){

        int i[]= new int[]{4,5,6,7,0,1,2};
        //int i[]= new int[]{1};
        System.out.println(solve(i,0));

    }
}
