class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int j = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++)
        {
            sum += nums[i];

            while(sum >= target)
            {
                if(i-j+1 < min)
                    min = i-j+1;

                sum -= nums[j];
                j++;
            }
        }

        if(min!=Integer.MAX_VALUE)
            return min;
        else
            return 0;

    }
}