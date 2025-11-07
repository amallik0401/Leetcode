class Solution {
    public int romanToInt(String s) {

        int n = s.length();
        int ans =0 ,num= 0 ;
        
        for(int i = n-1 ; i>=0 ;i--)
        {
            ans = res(s.charAt(i));
            if (4 * ans < num)
                num -= ans;
            else
                num += ans;
            
        }

        return num;
    }

    int res(char a)
    {
        switch(a)
        {
            case 'I':
                return 1;
            
            case 'V':
                return 5;
            
            case 'X':
                return 10;
            
            case 'L':
                return 50;
            
            case 'C':
                return 100;
            
            case 'D':
                return 500;
            
            case 'M':
                return 1000;
            
        }

        return 0;
    }
}