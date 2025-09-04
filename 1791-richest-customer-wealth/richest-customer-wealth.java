class Solution {
    public int maximumWealth(int[][] accounts) {

        int high ;
        int highest=0;

        for(int i = 0 ; i < accounts.length ; i++)
        {
            high = 0;
            for(int x : accounts[i])
            {
                high +=x;
            }

            if(high>highest)
            {
                highest = high;
            }
        }
        return highest;
    }
}