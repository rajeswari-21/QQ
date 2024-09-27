public class ReverseBit {
    static long solve(String s) {


        long res = 0;

        for (int i = 31; i >= 0; i--) {
           /*  res <<= 1;
           long y= (s.charAt(i) - '0');
            long x=  y% 2;
            res +=x;*/
            res <<= 1;
            int no= Integer.parseInt(String.valueOf(s.charAt(i)));
            if((no&1)==1)
                res^=1;
        }

        return res;
    }
    public static void main(String[] a){

        long res= solve("00000010100101000001111010011100");
        System.out.println(res);
    }
}
