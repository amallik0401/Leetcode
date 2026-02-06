class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0 || strs == null)
            return "";

        String pre = strs[0];
        int prelen = pre.length();

        for(int i = 1 ; i < strs.length ; i++)
        {
            String s = strs[i];

            while(prelen > s.length() || !pre.equals(s.substring(0 , prelen)))
            {
                prelen--;
                if(prelen == 0 )
                    return "";
                
                pre = pre.substring(0 , prelen);
            }
        }
        return pre;
    }
}