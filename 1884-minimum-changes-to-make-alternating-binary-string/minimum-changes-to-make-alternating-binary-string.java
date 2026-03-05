class Solution {
    public int minOperations(String s) {
        int n = s.length();
        String s1 = "1";
        String s2 = "0";

        for(int i =0 ; i < n ; i++)
        {
            if(s1.charAt(i)== '1')
            {
                s1 += '0';
                s2 += '1';
            }
            else
            {
                s2 += '0';
                s1 += '1';
            }
        }
        int c1 = 0 , c2 = 0;
        for(int i = 0; i < n ; i++)
        {
            if(s.charAt(i) == s1.charAt(i))
            {
                c2++;
            }
            else
            {
                c1++;
            }
        }

        return Math.min(c1,c2);
    }
}