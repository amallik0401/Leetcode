class Solution {
    int low , high;
    public String longestPalindrome(String s) {
        
        int n = s.length();

        if(n<2)
            return s;

        for(int i = 0 ; i < n-1 ; i ++)
        {
            helper(s,i,i);
            helper(s,i,i+1);
        }

        return s.substring(low , low+high);
        
    }

    void helper(String s , int j , int k)
    {
        while(k>=0 && j<s.length() && s.charAt(j) == s.charAt(k))
        {
            k--;
            j++;
        }

        if(high < j-k)
        {
            low = k+1;
            high = j-k-1;
        }
    }
}