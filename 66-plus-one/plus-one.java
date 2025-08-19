class Solution {
    public int[] plusOne(int[] digits) {

        for(int j = 0 ; j<digits.length ; j++)
        {
            if(digits[j] != 9)
            {
                if(digits[digits.length-1]<9){
                    digits[digits.length-1] = digits[digits.length-1] + 1;
                    return digits;
                }
                else{
                    int i = digits.length-1;
                    while(digits[i] == 9)
                    {
                        digits[i] = 0;
                        i--;
                    }

                    digits[i] = digits[i] + 1;
                    return digits;
                }
            }      
            
        }

        int str2[] = new int[digits.length+1];
        str2[0] = 1;

        for(int i = 1 ;i<=digits.length ; i++)
        {
            str2[i] =0;
        }

        return str2;

        
    }
}