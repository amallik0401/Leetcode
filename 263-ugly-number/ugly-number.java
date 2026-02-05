class Solution {
    public boolean isUgly(int n) {
        int factors[]={2,3,5};
        if(n<=0)
            return false;
        for(int i : factors)
        {
            while(n%i==0)
            {
                n=n/i;
            }
        }
        return (n==1);
    }
}