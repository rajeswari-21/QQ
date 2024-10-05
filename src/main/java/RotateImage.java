import java.util.Arrays;

public class RotateImage {

    public static void rotate(int[][] matrix) {

        int n= matrix.length;
        //transpose
        for(int i=0;i<=n-2;i++)
        {
            for(int j=i+1;j<=n-1;j++)
            {
                swap(matrix, i,j);
            }
        }

        //reverse
        for(int i=0;i<matrix.length;i++){
            reverse(matrix[i]);
        }

    }

    static void swap(int[][] matrix, int a, int b)
    {
        int temp= matrix[a][b];
        matrix[a][b]=matrix[b][a];
        matrix[b][a]=temp;
    }

    static void reverse(int[] mat)
    {
        int len= mat.length;
        int p1=0;
        int p2=len-1;
        while(p1<p2)
        {
            int tem= mat[p1];
            mat[p1]= mat[p2];
            mat[p2] = tem;
            p1++;
            p2--;
        }
    }

    public static void main(String[] a) {


        int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
        //int[][] mat = {{0,1,2,0}, {3,4,5,2},{1,3,1,5}};
        //[0,1,2,0],[3,4,5,2],[1,3,1,5]


        rotate(mat);
        // setZeroesOptimized(mat1);
        System.out.println("Optimized: ");
        Arrays.stream(mat). forEach(e-> {
            for (int i:e
                 ) {
                System.out.print(i + " ,");

            }
        });
        System.out.println();

    }
}
