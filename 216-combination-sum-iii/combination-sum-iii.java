class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> ls = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        helper(ls, ans , k , 1, n);

        return ans;

    }

    void helper(List<Integer> ls , List<List<Integer>> ans, int k , int i, int sum)
    {
        if(ls.size()==k)
        {
            if(sum==0)
            {
                ans.add(new ArrayList<>(ls));
            }
            return;
        }
        if(i > 9) return;

        ls.add(i);
        helper(ls , ans , k , i+1 , sum - i);
        ls.remove(ls.size()-1);
        helper(ls , ans , k ,i+1, sum);
    }
}