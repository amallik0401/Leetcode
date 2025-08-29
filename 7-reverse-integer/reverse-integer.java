class Solution {
    public int reverse(int x) {
        int num = x;
        int rev = 0;

        while(num!=0)
        {
            int a = num%10;

            if((rev> Integer.MAX_VALUE/10) || (rev< Integer.MIN_VALUE/10))
            {
                return 0;
            }
            rev = rev*10 + a;
            num/=10;
        }

        return rev;
    }
}