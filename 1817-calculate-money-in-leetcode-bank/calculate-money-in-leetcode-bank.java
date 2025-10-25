class Solution {
    public int totalMoney(int n) {
        int mon= 0 , count =0 , sum =0;

        for(int i = 1; i<=n ; i++)
        {
            if(count==7)
            {
                mon = i/7 + 1;
                count=0;
            }
            else
            {
                mon++;
            }

            sum+=mon;
            count++;
        }
        return sum;
    }
}