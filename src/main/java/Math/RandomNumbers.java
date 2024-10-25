package Math;


/** * The rand7() API is already defined in the parent class SolBase.
        * public int rand7();
        * @return a random integer in the range 1 to 7
        */

public class RandomNumbers extends SolBase {

    public static int rand10() {

        while(true){
            int x= (7*(rand7()-1)) + (rand7()-1);
            if(x>=40)
                continue;

            return (x%10)+1;
        }


    }


    public static void main(String[] s)
    {
        System.out.println(rand10());
    }




}

