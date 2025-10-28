class Solution 
{
    public int countValidSelections(int[] nums) 
    {

        int count = 0, n = nums.length;

        for(int i = 0 ; i<n  ;i++)
        {
            if(nums[i]==0)
            {
                int left = 0 ,right = 0;

                for(int j = i ; j>=0 ; j--)
                {
                    left+=nums[j];
                }

                for(int k = i ; k<n ; k++)
                {
                    right+=nums[k];
                }

                if(left==right)
                    count+=2;
                else if((Math.abs(left-right))==1)
                    count+=1;
            }
        }

        return count;
    }
}