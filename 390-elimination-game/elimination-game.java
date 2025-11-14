class Solution {
    public int lastRemaining(int n) {
        boolean left= true;

        return helper(n,left);
        
    }

    int helper(int n , boolean left)
    {
        if(n==1)return 1;

        if(left)
            return 2*helper(n/2 , false);
        else
        {
            if(n%2==0) return 2* helper(n/2 , true)-1;
            else  return 2*helper(n/2 ,true);

        }

    }
}