class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;

        int max = 0;

        int a[] = new int[n];

        for(int i = 0 ; i < n ; i++)
        {
            max = Math.max(nums[i], max);
            a[i] = max;
        }
        for(int i = 0 ; i < n ; i++)
        {
            a[i] = gcd(a[i] , nums[i]);
        }
        Arrays.sort(a);

        long ans = 0;

        for(int i = 0 ; i < n/2 ;i++)
        {
            ans += gcd(a[i] , a[n-1-i]);
        }
        return ans;
    }

    int gcd(int a , int b)
    {
        if(a > b)
            return gcd(b,a);

        while(a>0)
        {
            int temp = a;
            a = b%a;
            b = temp; 
        }
        return b;
    }
}