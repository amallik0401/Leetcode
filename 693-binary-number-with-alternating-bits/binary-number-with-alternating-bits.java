class Solution {
    public boolean hasAlternatingBits(int n) 
    {
        String sb = Integer.toBinaryString(n);

        for(int i = 1 ; i < sb.length() ; i++)
            if(sb.charAt(i) == sb.charAt(i-1))
                return false;
        return true;
    }
}