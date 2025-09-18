class Solution {
    public int sumOfSquares(int[] nums) 
    {
        int sum =0 ;
        int n = nums.length;
        System.out.println(n);

        for(int i=0 ; i<nums.length ; i++)
        {
            int j=i+1;
            if(n%j==0)
            {
                sum+= (nums[i]*nums[i]);
            }
        }
        return sum;
    }
}