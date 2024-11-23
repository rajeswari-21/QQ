package BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class SearchIn2DMatrixAmazon {

    //optimised tc= O(log(m*n))
    public static boolean searchMatrix(int[][] matrix, int target) {

        int low=0;
        int r= matrix.length;
        int c= matrix[0].length;
        int high=(r*c)-1;
        while(low<=high){
            int mid=(low+high)/2;
            int row=mid/c;
            int col=mid%c;
            if(matrix[row][col]==target)
                return true;
            else if(matrix[row][col]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        return false;

    }

    //not optimised, tc= O(n) + O(log(m))
    static boolean solve(List<List<Integer>>  input,int target){


        int len= input.size();
        for(int i=0;i<len;i++){

            List<Integer> temp= input.get(i);
            if(temp.get(0)<=target && temp.get(temp.size()-1)>=target)
            {
                int low= 0;
                int high= temp.size()-1;
                while(low<=high)
                {
                    int mid= (low+high)/2;
                    if(temp.get(mid)== target) return true;
                    else if(temp.get(mid)>target)
                        high=mid-1;
                    else
                        low=mid+1;
                }


            }
        }

        return false;
    }

    public static void main(String[] st)
    {
        int ar[][]= new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int arr[][]= new int[][]{{1}};
        List<List<Integer>> list= new ArrayList<>();
        for(int[] i:arr)
        {
            List temp= new ArrayList<Integer>();
           for(int j:i)
           {
               temp.add(j);
           }
            list.add(temp);
        }
        //int i[]= new int[]{1};
        //System.out.println(solve(list,1));

        System.out.println(searchMatrix(ar,3));
    }
}
