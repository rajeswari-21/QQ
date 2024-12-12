package Sorting;

import java.util.Arrays;

public class SortColors {

    static int[] solve(int[]  input){
        int one=-1, zero=-1, two=0;
        while(two<input.length)
        {
            if(input[two]==1)
            {
                one++;
                swap(input,one,two);
                two++;
            }
            else if(input[two]==0)
            {

                one++;
                swap(input,one,two);
                zero++;

                swap(input,zero,one);
                two++;
            }
            else two++;
        }

        return input;
    }

    static void swap(int[] arr, int x, int y)
    {

        int temp=arr[x];
        arr[x]= arr[y];
        arr[y]=temp;
        /*arr[x]= arr[x] ^ arr[y];
        arr[y]= arr[x] ^ arr[y];
        arr[x]= arr[x] ^ arr[y];*/
    }

    public static void main(String[] a) {


        int[] mat = {0,1,2};
        //2,1,0,1,2

        Arrays.stream(solve(mat)).forEach(i->System.out.print(i + " ,"));


    }
}
