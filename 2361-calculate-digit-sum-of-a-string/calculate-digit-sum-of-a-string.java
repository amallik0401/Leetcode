class Solution {
    public String digitSum(String s, int k) {

        while(s.length() > k)
        {
            StringBuilder sb= new StringBuilder();

            for(int  i = 0 ; i < s.length() ; i+=k)
            {
                int sum= 0;
                for(int j = i ; j < Math.min(i+k , s.length()); j++)
                {
                    sum+= Character.getNumericValue(s.charAt(j));
                }
                sb.append(sum);
            }
            
            s = sb.toString();
        }
        return  s;
    }
}