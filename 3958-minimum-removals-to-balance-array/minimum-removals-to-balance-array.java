class Solution {
    public int minRemoval(int[] nums, int k) {
        
        Arrays.sort(nums); 
        int j = 0;
        int ans = nums.length; 

        for(int i = 0 ; i < nums.length; i++)
        {
           while (j < nums.length && nums[j] <= (long) nums[i] * k)
           {
                j++;
           }
           ans = Math.min(ans, nums.length - (j-i));
        }

        return ans;
    }
}