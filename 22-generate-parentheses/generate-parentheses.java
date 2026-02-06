class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(res , "" , 0 , 0 , n);

        return res;
    }

    void helper(List<String> res , String s , int left , int right , int n)
    {
        if(s.length() == 2*n)
        {
            res.add(s);
            return;
        }

        if(left < n)
        {
            helper(res , s +"(" , left+1 , right , n);
        }

        if(right < left)
        {
            helper(res , s + ")" , left , right+1 , n);
        }
        
    }
}