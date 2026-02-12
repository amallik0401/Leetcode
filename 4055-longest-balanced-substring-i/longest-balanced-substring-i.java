class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int [] cnt = new int[26];
        int max = 0;

        for(int i = 0 ; i < n ; ++i)
        {
            Arrays.fill(cnt , 0);
            int mx = 0 , v = 0;
            for(int j = i ; j < n ; ++j)
            {
                int ch = s.charAt(j) - 'a';
                
                if(++cnt[ch] == 1)
                {
                    v++;
                }

                mx = Math.max(mx , cnt[ch]);

                if(mx * v == j-i+1)
                {
                    max = Math.max(max , j-i+1);
                }
            }

        }
 
           return  max;
    }
}