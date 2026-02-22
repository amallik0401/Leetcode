class Solution {
    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);

        int max = 0 ;
        int j =0;
        for(int i = 1 ; i < s.length() ; i++)
        {
            if(s.charAt(i) == '0')
                continue;
            
            max = Math.max(max , (i-j));
            j = i;
        }

        return max;
    }
}