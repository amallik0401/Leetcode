class Solution {
    public int[] recoverOrder(int[] order, int[] friends) 
    {
        int n = friends.length;
        int ind=0;
        int []arr = new int[n];
        for(int i = 0 ; i<order.length ; i++)
        {
            for(int j = 0 ;j<n ; j++)
            {
                if(order[i]==friends[j])
                {
                    arr[ind] = friends[j];
                    ind++; 
                }
            }
        }   

        return arr;
    }
}