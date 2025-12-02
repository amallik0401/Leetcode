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
                if (a == 1)
                {
                    count++;
                    continue;
                }
                int b = nums[j] % 10;
                if (b == 1)
                {
                    count++;
                    continue;
                }

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


        while(y!=0)
        {
            int temp = y;
            y = x%y;
            x = temp;
        }
        return x==1;
    }
}