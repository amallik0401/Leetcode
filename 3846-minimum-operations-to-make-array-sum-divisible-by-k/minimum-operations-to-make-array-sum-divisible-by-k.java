class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        for(int x : nums)
        {
            sum += x;
        }

        while(sum%k!=0 )
        {
            sum--;
            count++;
        }

        return count;
    }
}