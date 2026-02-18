class Solution {
    public boolean hasAlternatingBits(int n) {
        StringBuilder sb = new StringBuilder();

        if(n==0)
            sb.append("0");
        else
        {
            while(n>0)
            {
                int rem = n%2;
                sb.insert(0 , rem);
                n /=2; 
            }
        }

        for(int i = 1 ; i < sb.length() ; i++)
        {
            if(sb.charAt(i) == sb.charAt(i-1))
                return false;
        }
        return true;
    }
}