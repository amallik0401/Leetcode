class Solution 
{
    public int myAtoi(String s) 
    {
        if(s.length() == 0 || s==null )
        {
            return 0;
        }
        final int max = Integer.MAX_VALUE;
        final int min = Integer.MIN_VALUE;

        int b = 0 ;
        int c = 1;

        while(b<s.length() &&  s.charAt(b)==' ')
        {
            b++;
        }
        if (b == s.length()) 
        {
            return 0;
        }

        if(s.charAt(b) == '-')
        {
            c = -1;
            b++;
        }
        else if(s.charAt(b) == '+')
        {
            b++;
        }

        long a = 0;
        while(b<s.length() && Character.isDigit(s.charAt(b)))
        {
            int digit = s.charAt(b) - '0';

            a = a*10 + digit;


            if (c * a <= min)
            {
                return min;
            }

            if (c * a >= max) 
            {
                return max;
            }
            b++;
        }

        return (int)(c*a);
        
    }
}