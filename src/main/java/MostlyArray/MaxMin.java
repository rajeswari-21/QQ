package MostlyArray;

//google
public class MaxMin {

    public static int solve(int[] A) {

        long max=-1l;
        long min= 1000000000l;
        for(int i=0; i<A.length;i++)
        {
            if(A[i]>max)
                max= A[i];
            else if(A[i]<min)
                min=A[i];
        }

        int sum=0;
        if(max<0 || min<0)
            sum= (int)(max+min);
        else
            sum= (int)(max-min);

        return sum;
    }

    public static void main(String[] a) {


        int[] mat = {-2, 1, -4, 5, 3 };
        //int[][] mat = {{0,1,2,0}, {3,4,5,2},{1,3,1,5}};
        //[0,1,2,0],[3,4,5,2],[1,3,1,5]


        //long res= dividePlayers(mat);
        int ans= solve(mat);
        System.out.println(ans);
        //Arrays.stream(mat). forEach(e-> System.out.print(e + " ,"));
        //Arrays.stream(arr).forEach(e-> System.out.print(e + " ,"));

    }
}
