class Solution {
    public int splitArray(int[] nums, int k) {
        int i = 0 ; 
        int j = 0;
        int ans = Integer.MAX_VALUE;

        for(int x : nums)
        {
            i = Math.max(x, i);
            j += x;
        }

        while(i <= j)
        {
            int mid = (i+j)/2;

            if(checker(nums , mid , k))
            {
                ans = Math.min(ans , mid);
                j= mid-1;
            }
            else
            {
                i = mid+1;
            }
        }
        return ans;
    }

    boolean checker(int []nums , int mid , int k)
    {
        int allo = 1;
        int sum = 0;

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i]> mid)
                return false;

            if(sum + nums[i] > mid)
            {
                allo++;
                sum = nums[i];
            }
            else
            {
                sum += nums[i];
            }
        }

        if(allo > k)
        {
            return false;
        }
        
        return true;
    }
}