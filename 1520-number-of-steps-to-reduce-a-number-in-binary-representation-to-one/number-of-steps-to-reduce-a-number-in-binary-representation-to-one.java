class Solution {
    public int numSteps(String s) {
        
        int step = 0 , carry = 0;

        for(int i = s.length()-1 ; i>0 ; i--)
        {
            int bit = (s.charAt(i) - '0') + carry;

            if(bit == 1)
            {
                step+=2;
                carry = 1;
            }
            else
            {
                step+=1;
            }
        }

        return step+carry;
    }
}