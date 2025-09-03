class Solution {
    public boolean isPalindrome(String s) {

        int n = s.length();
        String a = "";

        for(int i = 0 ; i < n ;i++)
        {
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                a+=Character.toLowerCase(ch);
            }
        }
        String b = "";
        int m = a.length();
        for(int i = m-1 ; i >= 0 ;i--)
        {
            b+=a.charAt(i);
        }
        return a.equals(b);
    }
}