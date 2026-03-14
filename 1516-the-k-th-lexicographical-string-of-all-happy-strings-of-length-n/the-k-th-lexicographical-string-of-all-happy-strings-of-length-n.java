class Solution 
{
    int count = 0;
    String ans = "";
    public String getHappyString(int n, int k) 
    {
        rec(n , "" ,k);
        return ans;
    }

    void rec(int n , String s , int k)
    {
        if(s.length()==n)
        {
            count++;
            if(count == k)
            {
                ans = s;
            }
            return;
        }

        for(char ch = 'a' ; ch <= 'c' ; ch++)
        {
            if(s.length() >0 && s.charAt(s.length()-1) == ch)
                continue;

            rec(n , s + ch , k);

            if(!ans.equals(""))
                return;
        }

    }


}