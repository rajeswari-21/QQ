package BitManupulation;

public class CheckNoOf1Bits {

    public static int hammingWeight(int n) {
        int count=0;
        while(n>0)
        {
            if((n&1)==1)
                count++;
            n=n>>1;
        }

        return count;
    }

    public static void main(String[] z){

        System.out.println(hammingWeight(5));
    }
}
