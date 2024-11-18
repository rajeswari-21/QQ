package BitManupulation;

public class XORLtoR {
    public static int findXOR(int L, int R){

        int l= XORofRangeOfNo(L-1);
        int r= XORofRangeOfNo(R);
        return l^r;

    }

    static int XORofRangeOfNo(int no)
    {
        if(no%4==0)return no;
        else if(no%4==1)return 1;
        else if(no%4==2)return no+1;
        else if(no%4==3)return 0;

        return 0;
    }

    public static void main(String[] z){

        System.out.println(findXOR(3,5));
    }
}
