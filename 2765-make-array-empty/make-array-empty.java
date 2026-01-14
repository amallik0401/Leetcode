class Solution {
    public long countOperationsToEmptyArray(int[] nums) {
        
        Map<Integer, Integer> pos = new HashMap<>();

        long n = nums.length , res = n;

        for(int i = 0 ; i < n ; i++)
        {
            pos.put(nums[i] , i);
        }

        Arrays.sort(nums);

        for(int i = 1 ; i < n ; i++)
        {
            if(pos.get(nums[i]) < pos.get(nums[i-1]))
                res += n-i;
        }

        return res;
    }
}