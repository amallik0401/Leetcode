class Solution {
    public void moveZeroes(int[] nums) {
        
        int l = 0 , e = 0;

        while(e<nums.length )
        {
            if(nums[e] != 0)
            {
                int temp = nums[l];
                nums[l] = nums[e];
                nums[e] = temp;
                l++; 
            }
            e++;
        }

    }
}