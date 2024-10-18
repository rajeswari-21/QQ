package MostlyArray;

public class ArrayCopyClone {

    public static void main(String[] u){

        int[] nums= new int[]{1,2,3};
        int a[] = nums.clone();
        int b[]=new int[2*nums.length];
        System.arraycopy(nums, 0, b, 0, nums.length);
        System.arraycopy(a,0,b,nums.length,a.length);



        for(int x:b)
            System.out.println(x);
    }

}
