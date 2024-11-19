package BinarySearch;

public class FindPeakElement {

    static int peak(int[]  input){

        int len=input.length;
        //check manually edge cases to avoid overflow cases
        if(len>1 && input[0]>input[1])
            return 0;
        if(len>1 && input[len-1]>input[len-2])
            return len-1;
        if(len==1)
            return 0;

        int low=1;
        int high= len-2;

        while(low<=high)
        {
            int mid= (low+high)/2;
            //check peak condition
            if(input[mid]>input[mid-1] && input[mid]>input[mid+1]) return mid;

                // if in increasing curve
            else if(input[mid]>input[mid-1] && input[mid]<input[mid+1])
                low=mid+1;
            else // if in decreasing curve
                high=mid-1;
        }

        return -1;
    }

    public static void main(String[] z){

        //int i[]= new int[]{1,1,2,3,3,4,4,8,8};
        //int i[]= new int[]{1,2,3,1};
        int i[]= new int[]{1,2};
        System.out.println(peak(i));

    }
}
