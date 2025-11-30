class Solution {
    public int maxSumDivThree(int[] nums) {

        int [] v = new int[3];
    
        for(int x : nums)
        {
            int []curr = v.clone();

            for(int n : curr)
            {
                int sum = n+ x;
                int r = sum%3;
                v[r] = Math.max(v[r],sum);
            }             
        }              

        return v[0];

    }
}