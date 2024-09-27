import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class SetMatrixZero {

    // better solution can be optimized in case of space complexity
        public static void setZeroes(int[][] matrix) {


            int row= matrix.length;
            int col= matrix[0].length;
            int rno=-1;int cno=-1;
            int count=0;
            Map<Integer,Integer[]> map= new HashMap<Integer,Integer[]>();
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    if(matrix[i][j]==0)
                    {
                        count++;
                        Integer indx[]= {i,j};
                        map.put(count,indx);

                    }
                }
            }

            for(Map.Entry<Integer,Integer[]> entry:map.entrySet())
            {
                Integer indx1[]= entry.getValue();

                setRow(indx1[0],col,matrix);
                setCol(indx1[1], row,matrix);

            }




        }

        public static void setRow(int rowno, int colLen, int[][] mat)
        {
            for(int k=0;k<colLen;k++)
            {
                mat[rowno][k]=0;
            }

        }

        public static void setCol(int colno, int rowLen, int[][] mat)
        {
            for(int k=0;k<rowLen;k++)
            {
                mat[k][colno]=0;
            }

        }


        // Optimized Solution

    public static void setZeroesOptimized(int[][] matrix) {



        int row= matrix.length;
        int col= matrix[0].length;
        int col0=1;
        // step 1: Traverse the matrix and
        // mark 1st row & col accordingly:
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==0)
                {
                    //row counter
                    matrix[i][0]=0;

                    //column counter
                    if(j==0)
                        col0=0;
                    else
                        matrix[0][j]=0;

                }
            }
        }

        // traverse and set the rest array to 0 as per 1st row and 1st column
        for(int m=1;m<row;m++)
        {
            for(int n=1;n<col;n++)
            {
                if(matrix[m][0]==0 || matrix[0][n]==0)
                    matrix[m][n]=0;

            }
        }

        //traverse the couter row and col
        if(matrix[0][0]==0)
        {
            for(int k=0; k<col; k++)
            {
                matrix[0][k]=0;
            }
        }

        if(col0==0)
        {
            for(int l=0; l<row; l++)
            {
                matrix[l][0]=0;
            }
        }


    }


        public static void main(String[] a) {


            int[][] mat1 = {{0,1}};
            int[][] mat = {{0,1,2,0}, {3,4,5,2},{1,3,1,5}};
            //[0,1,2,0],[3,4,5,2],[1,3,1,5]


            setZeroes(mat);
            setZeroesOptimized(mat1);

            System.out.println("Optimized: ");

            Arrays.stream(mat1). forEach(e-> {
                for (int i:e) {
                    System.out.print(i + " ,") ;
                }
                System.out.println();
            });

            System.out.println("Better: ");
            Arrays.stream(mat).
                    forEach(e-> {
                        for (int i:e) {
                            System.out.print(i + " ,") ;
                        }
                        System.out.println();
                    });
            System.out.println();

        }
}
