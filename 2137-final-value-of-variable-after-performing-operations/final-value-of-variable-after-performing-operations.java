class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int i=0;

        for(String s : operations)
        {
            if(s.charAt(0)=='-' || s.charAt(2)=='-')
            {
                i--;
            }
            if(s.charAt(0)=='+' || s.charAt(2)=='+')
            {
                i++;
            }
        }
        return i;
    }
}