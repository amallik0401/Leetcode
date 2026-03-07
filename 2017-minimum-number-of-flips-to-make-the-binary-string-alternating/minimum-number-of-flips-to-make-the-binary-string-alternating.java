class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String t = s+s;

        int ans = n;
        int mis = 0;

        for(int i = 0; i < 2*n ;i++)
        {
            char exp = (i%2 == 0) ? '0' : '1';

            if(t.charAt(i) != exp)
                mis++;

            if(i>=n)
            {
                int left = i -n;
                char expLeft = (left%2==0) ? '0' : '1';
                if(t.charAt(left) != expLeft)
                    mis--;
            }

            if(i >= n -1 )
            {
                int mis1 = n - mis;
                ans = Math.min (ans , Math.min(mis, mis1));
            }
        }

        return ans;
    }
}