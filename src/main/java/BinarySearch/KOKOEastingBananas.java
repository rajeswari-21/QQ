package BinarySearch;

import java.util.Arrays;

public class KOKOEastingBananas {

    public static int minEatingSpeed(int[] piles, int h) {

        int ans=0;
        //min bananas/hr =k
        int min=1;
        int max = Arrays.stream(piles).max().getAsInt(); // max bananas/hr, hence each banana in 1 hour
        while(min<=max)
        {
            int mid=(min+max)/2;
            int temp= checkNoOfHours(mid,piles);
            if(temp<=h)
            {
                ans= mid; // for now lets consider this the best k
                max=mid-1; // check better options
            }
            else
                min=mid+1;
        }
        return ans;

    }

    static int checkNoOfHours(int speed, int[] piles)
    {
        int hours=0;
        for(int i=0;i<piles.length;i++)
        {
            if(speed>piles[i])
                hours+=1;
            else
                hours+=Math.ceil((double)piles[i]/(double)speed);
        }
        return hours;
    }

    public static void main(String[] z){

        int i[]= new int[]{3,6,7,11};
        //int i[]= new int[]{1,2,3,1};
        //int i[]= new int[]{1,2};
        System.out.println(minEatingSpeed(i,8));

    }
}
