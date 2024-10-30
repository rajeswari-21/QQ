package Math;

public class PallindromString {

        static boolean check(String s){

            int start=0;
            int end= s.length()-1;
            while(start<=end)
            {
                if(s.charAt(start++)!=s.charAt(end--))
                    return false;
            }
            return true;
        }

        public static void main(String[] x)
        {
            System.out.println(check("abcba"));
        }
}



