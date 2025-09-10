class Solution {
    public int[] runningSum(int[] nums) {

        if(nums.length==0||nums==null)
        {
            return nums;
        }
        int prev = 0;
        int curr = nums[0];

        for(int i = 0 ; i <nums.length ; i++)
        {
            nums[i] +=prev;
            prev = nums[i]; 
        }

        return nums;
        
    }
}