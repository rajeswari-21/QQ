package BinarySearch;

import java.util.Arrays;

//google microsoft
public class MagneticForceBeteen2Balls {

    static boolean  checkPositionsforForce(int force, int[] pos, int balls){

        int prevBallPos=0; int count=1;// since considering 1 call kept in pos 0
        int len=pos.length;
        //check all positions from 1 to n. 0th is already occupied
        for(int i=1;i<len;i++)
        {
            if(pos[i]-pos[prevBallPos] >= force)
            {
                prevBallPos=i;
                count++;
            }
            if(count==balls)
                return true;
        }
        return false;
    }
    public static int maxDistance(int[] position, int m) {

        //min force & max force
        Arrays.sort(position);
        int lowF=1;
        int len=position.length;
        int highF= position[len-1]- position[0];
        int ans=0;
        while(lowF<=highF)
        {
            int midF=(lowF+highF)/2;
            //if this force 3 balls be placed
            if(checkPositionsforForce(midF,position,m))
            {
                ans=midF;
                lowF=midF+1; // find more max force
            }
            else
                highF=midF-1;
        }

        return ans;


    }
    public static void main(String[] z){

        int i[]= new int[]{1,2,3,4,7};
        //int i[]= new int[]{1,2,3,1};
        //int i[]= new int[]{1,2};
        System.out.println((maxDistance(i,3)));

    }
}
