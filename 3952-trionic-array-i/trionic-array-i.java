class Solution {
    public boolean isTrionic(int[] nums) {
        
        int n = nums.length;
        int i = 0;

        //increasing
        while(i + 1 < n && nums[i] < nums[i+1])
            i++;

        if(i == 0 || i == n-1)
            return false;

        //decreasing
        while(i + 1 < n && nums[i] > nums[i+1])
            i++;

        if(i == n-1)
            return false;

        //increasing
        while(i + 1 < n && nums[i] < nums[i+1])
            i++;

        return i == n -1;
    }
}