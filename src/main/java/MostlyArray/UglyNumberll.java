package MostlyArray;

//BRUT force TC: o(nlogn) to o(n^2)
public class UglyNumberll {

        static int solve(int n){

            int val=2, i=1;
            int res=1;

            if(n==1)
            {
                return 1;
            }
            // i<n since skipping 1
            while(i<n)
            {
                int temp=val;
                temp=div2(temp);
                temp=div3(temp);
                temp=div5(temp);

                if(temp==1)
                {
                    res=val;
                    i++;
                    val++;
                }
                else
                    val++;


            }
            return res;


        }

        static int div2(int x)
        {

            while(x%2==0)
            {
                x/=2;
            }
            return x;
        }
        static int div3(int x)
        {

            while(x%3==0)
            {
                x/=3;
            }
            return x;

        }

        static int div5(int x)
        {

            while(x%5==0)
            {
                x/=5;
            }
            return x;

        }

        public static void main(String[] a){

            int res= solve(10);
            System.out.println(res);
        }

}
