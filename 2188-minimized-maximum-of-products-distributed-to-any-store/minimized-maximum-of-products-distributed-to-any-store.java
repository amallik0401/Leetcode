class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        
        int m = quantities.length;

        int l = 0;
        int r = 0;

        for(int q : quantities)
        {
            if(q>r)
                r=q;
        }

        while(l < r)
        {
            int mid = l + (r-l)/2;

            if(poss(mid , quantities , n))
                r = mid;
            else
                l = mid +1;
        }
        return l;
    }

    private boolean poss(int x , int []quantities ,int n)
    {
        int j = 0;

        int rem = quantities[j];

        for(int i = 0 ; i < n ; i++)
        {
            if(rem <= x)
            {
                j++;
                if(j == quantities.length)
                    return true;
                else
                    rem = quantities[j];
            }
            else
            {
                rem -= x; 
            }
        }
        return false;
    }
}