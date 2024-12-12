package BinarySearch;

public class SquareRoot {

    public static int mySqrt(int x) {

        if(x==1)
            return x;
        return square(x,0,x);
    }
    static int square(int x, int low, int high)
    {
        while(low<=high)
        {
            int mid=(low+high)/2;
            //base case
            if((long)(mid*mid)<=x && ((long)(mid+1)*(mid+1))>x)
                return mid;
            if((long)(mid*mid)>x)
                high=mid-1;
            else
                low=mid+1;

        }
        return 0;

    }

    public static void main(String[] a) {


        int[] mat = {0,2,1};
        //1,3,2,3,1
        //2147483647,2147483647,2147483647,2147483647,2147483647,2147483647
        //2147483647,2147483647,-2147483647,-2147483647,-2147483647,2147483647
        System.out.print(mySqrt(2147395599));


    }
}
