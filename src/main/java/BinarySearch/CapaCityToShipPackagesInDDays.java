package BinarySearch;

public class CapaCityToShipPackagesInDDays {
//Note : the weights in conveyor belt hence, will be picked serially
    public static int shipWithinDays(int[] weights, int days) {

        int dchecked=0;
        int ansCap=0;
        //take range
        int max=0;
        int sum=0;
        for(int i=0;i<weights.length;i++)
        {
            sum+=weights[i];
            if(weights[i]>max)
                max= weights[i];
        }

        //check for every capacity from max to sum
        while(max<=sum)
        {
            int mid= (max+sum)/2;
            // function that returns no of days if cap=mid
            dchecked=checkDays(mid,weights);
            if(dchecked<=days)
            {
                sum=mid-1; // Try to find a smaller valid capacity
                ansCap=mid;
            }
            else
                max= mid+1; // Increase capacity if not feasible within given `days`

        }
        return max;

    }

    static int checkDays(int cap, int[] weights)
    {
        int days=1;
        int sum=0;
        for(int i=0;i<weights.length;i++){

            sum+=weights[i];
            if(sum>cap)
            {
                sum=weights[i];
                days+=1;
            }

        }
        return days;
    }

    public static void main(String[] z){

        int i[]= new int[]{1,2,3,4,5,6,7,8,9,10};
        //int i[]= new int[]{1,2,3,1};
        //int i[]= new int[]{1,2};
        System.out.println(shipWithinDays(i,5));

    }
}
