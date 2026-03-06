class Solution {
    public boolean checkOnesSegment(String s) {

        int count = 0;

        for(int i = 0 ; i < s.length() ; i++)
        {
            if(count== 0 && s.charAt(i) == '1')
            {
                continue;
            }

            if(s.charAt(i) == '0')
            {
                count= 1;
            }

            if(count> 0 && s.charAt(i) == '1')
            {
                return false;
            }

        }

        return true;
    }
}