class Solution {
    public boolean rotateString(String s, String goal) {
        
        if(s.length() != goal.length())
            return false;
        
        if(s.equals(goal))
            return true;

        StringBuilder sb = new StringBuilder(s);

        for(int i = 0 ; i < s.length() ; i++)
        {
            char c = sb.charAt(0);
            sb.delete(0,1);
            sb.append(c);

            if(sb.toString().equals(goal))
                return true;
        }

        return false;
    }
}