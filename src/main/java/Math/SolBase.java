package Math;

public class SolBase {

    public static int rand7(){

        int no=0;
        while(true){
            double temp=  Math.random();
            double temp1= temp* 10;
            no= (int) temp1; //downcast
            if(no>7)
                continue;
            return no;
        }

    }

    public static void main(String[] s)
    {
        System.out.println(rand7());
    }
}
