package recursion_Backtracking;

public class TargetSum {
    static int ways=0;
    public static int findTargetSumWays(int[] nums, int target) {
        if(nums.length==1 && target==nums[0])
            return 1;

        fun(0,0,nums, target);
        return ways;
    }

    static void fun(int i, int sum, int[] nums, int target)
    {
        if(i==nums.length)
        {
           if(sum==target) ways+=1;
            return;
        }



            fun(i+1,sum+=nums[i],nums, target);

            sum-=nums[i];

            fun(i+1,sum-=nums[i],nums, target);

            sum+=nums[i];


    }

    public static void main(String[] args){

        int[] num={1,1,1};
        System.out.println(findTargetSumWays(num,1));
    }
}
