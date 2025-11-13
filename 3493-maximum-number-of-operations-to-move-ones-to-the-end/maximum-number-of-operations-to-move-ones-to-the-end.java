class Solution {
    public int maxOperations(String s) {
        int ans= 0;
        int countOne=0;
        char[] ch = s.toCharArray();
        
        for(int i = 0 ;i<ch.length ; i++)
        {
            if(ch[i]=='0')
            {
                while(i+1<ch.length && ch[i+1]=='0')
                {
                    i++;
                }
                ans+= countOne;
            }
            else
            {
                countOne++;
            }
        }
        return ans;
    }
}