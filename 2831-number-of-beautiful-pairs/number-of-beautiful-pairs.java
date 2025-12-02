class Solution {
    public int countBeautifulPairs(int[] nums) {
        
        int n = nums.length;
        int count=0;
        for(int i = 0 ; i < n-1; i++)
        {
            for(int j = i+1 ; j < n ; j++)
            {
                int a = nums[i];
                while(a >= 10)
                {
                    a/=10;
                }
                int b = nums[j] % 10;

                if(gcd(a,b))
                {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean gcd(int x,int y)
    {
        if (x == 1 || y == 1)
        {
            return true;
        }
        
        while(y!=0)
        {
            int temp = y;
            y = x%y;
            x = temp;
        }
        return x==1;
    }
}