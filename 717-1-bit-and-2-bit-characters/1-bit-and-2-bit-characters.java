class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        
        int n = bits.length;
        if(bits[n-1]!=0)
            return false;

        for(int i = 0 ; i<n ; i++)
        {
            if(bits[i]==1)
            {
                i++;
                continue;
            }
            
            if(i==n-1)
                return true;
        }

        return false;
    }
}