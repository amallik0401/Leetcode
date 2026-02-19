class Solution {
    public int countBinarySubstrings(String s) {
        int ans = 0;
        int prev = 0;
        int curr= 1;

        for(int i = 1 ; i < s.length() ; i++)
        {
            if(s.charAt(i) == s.charAt(i-1))
                curr++;
            else
            {
                ans += Math.min(curr , prev);
                prev= curr;
                curr = 1;
            }
        }
        ans += Math.min(curr,prev);
        return ans;
    }
}