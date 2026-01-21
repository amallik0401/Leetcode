public class Solution {
    int lo,maxLen;

    public String longestPalindrome(String s) 
    {     
        int n = s.length();

        if(n<2)
            return s;

        for(int i = 0 ; i < n-1 ; i++)
        {
            helper(s,i,i);
            helper(s,i,i+1);
        }

        return s.substring(lo , lo+maxLen);
    }

    void helper(String s , int k , int j)
    {
        while(k>=0 && j<s.length() && s.charAt(k)==s.charAt(j))
        {
            k--;
            j++;
        }

        if(maxLen < j - k -1)
        {
            lo = k+1;
            maxLen = j-k-1;
        }
    }
}