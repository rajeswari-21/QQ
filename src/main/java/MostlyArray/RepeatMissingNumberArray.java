package MostlyArray;

import java.util.Arrays;

//amazon
public class RepeatMissingNumberArray {


        // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
        public static int[] repeatedNumber(final int[] A) {

            int len= A.length;
            int sum=0;
            int target=0;
            long sum2=0l;
            long target2=0l;

            for(int i=0;i<len;i++)
            {
                // for equation 1
                sum+=A[i];

                // for equation 2
                sum2+= A[i]*A[i];
            }

            target= (len*(len+1))/2;
            target2= (len*(len+1)*(2*len+1))/6;

            int eq1=target-sum; // x-y
            int eq2= (int)(target2-sum2); // x2-y2
            int eq3= eq2/eq1; // x+y

            int missi= (eq1+eq3)/2;
            int repeat= eq3-missi;

            return new int[] {repeat,missi};

        }

    public static void main(String[] a) {


        int[] mat = {3,2,5,1,3,4};
        //int[][] mat = {{0,1,2,0}, {3,4,5,2},{1,3,1,5}};
        //[0,1,2,0],[3,4,5,2],[1,3,1,5]


        //long res= dividePlayers(mat);
        int[] arr= repeatedNumber(mat);
        System.out.println("Optimized: ");
        //Arrays.stream(mat). forEach(e-> System.out.print(e + " ,"));
        Arrays.stream(arr).forEach(e-> System.out.print(e + " ,"));

    }
    }


