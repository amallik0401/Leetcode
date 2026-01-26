class Solution {
    public boolean checkZeroOnes(String s) {
        int one = 0 , maxOne = 0;
        int zero = 0 , maxZero = 0;

        for(char c : s.toCharArray())
        {
            if(c=='1')
            {
                one++;
                zero =0;
            }
            else
            {   
                zero++;
                one = 0;
            }

            maxOne = Math.max(maxOne , one);
            maxZero = Math.max(maxZero , zero);
        }

        return maxOne > maxZero ? true : false;
    }
}