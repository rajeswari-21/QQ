package MostlyArray;

public class UglyNumberll_opti {


        static int solve(int n){
            int[] arr= new int[n];
            int i=1;
            int i2=1,i3=1,i5=1;
            int count=1;
            arr[0]=1;

            while(count<n)
            {
                int multi2= 2 * i2;
                int multi3= 3 * i3;
                int multi5= 5 * i5;

                int choice= min(multi2,multi3,multi5);

                if(choice==multi2){
                    i2++;
                }

                else if(choice==multi3)
                    i3++;
                else if(choice==multi5)
                    i5++;


                i=choice;
                arr[count]=choice;
                count++;

            }

            for(int k:arr)
                System.out.println(k);
            return i;
        }

        static int min(int a, int b, int c)
        {
            if(a<=b && a<=c){
                return a;
            }

            else if(b<=a && b<=c)
                return b;
            else
                return c;

        }

    public static void main(String[] a){

        int res= solve(10);
        System.out.println(res);
    }

}
