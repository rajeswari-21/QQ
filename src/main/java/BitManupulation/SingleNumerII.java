package BitManupulation;

public class SingleNumerII {

    public int singleNumber(int[] nums) {

        int ans=0;
        for(int i=0;i<32;i++){
            // shifting 1 from 0 place to 31st place
            int mask= 1<<i;
            //intialize bit count for every ith place bit
            int bitCount=0;
            for(int n:nums)
            {
                //each no 0th bit
                if((n&mask)==1)
                    bitCount++; // sum of all the ith bit of all the numbers
            }
            if(bitCount%3!=0)
                ans = ans| mask;

        }
        return ans;
    }

    
}
