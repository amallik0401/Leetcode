class Solution {
    public int concatenatedBinary(int n) {
        
        int mod = 1000000007;
        long ans = 0;

        for(int i = 1 ; i <= n ; i++)
        {
            int len = Integer.toBinaryString(i).length();

            ans = ((ans << len) + i)%mod;
        }

        return (int)ans; 
    }
}