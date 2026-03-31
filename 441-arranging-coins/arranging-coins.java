class Solution {
    public int arrangeCoins(int n) {
        
        if(n==1)
            return 1;

        int c = 0;
        int i =1;
        while(n>0)
        {
            n -=i;
            i++;
            if(n>=0)
            {
                c++; 
            }
        }

        return c;
    }
}