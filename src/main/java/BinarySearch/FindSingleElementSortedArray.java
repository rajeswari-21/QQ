package BinarySearch;

import java.util.Arrays;

public class FindSingleElementSortedArray {

    static int find(int[]  input){

        int len= input.length;
        //edge cases
        if(input.length==1)
            return input[0];
        if(input[1]!=input[0])
            return input[0];
        if(input[len-1]!=input[len-2])
            return input[len-1];

        int low=1;
        int high=len-2;
        while(low<=high)
        {
            int mid=(low+high)/2;
            //condition for single element if left element and right element not equal to mid
            if(input[mid]!=input[mid-1] && input[mid]!=input[mid+1]) return input[mid];
            if((mid%2==1 && input[mid]==input[mid-1])||(mid%2==0 && input[mid]==input[mid+1]))
                low=mid+1;
            else
                high=mid-1;
        }
        //this is a dummy statement
        return -1;
    }

    public static void main(String[] z){

        int i[]= new int[]{1,1,2,3,3,4,4,8,8};
        System.out.println(find(i));

    }
}
