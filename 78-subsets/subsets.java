class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<Integer> ls = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums , 0 , ls , ans , nums.length);
        
        return ans;
    }

    void helper(int []arr , int i ,List<Integer> ls , List<List<Integer>> ans , int n)
    {
        if(i==n)
        {
            ans.add(new ArrayList<>(ls));
            return;
        }
        ls.add(arr[i]);
        helper(arr, i+1 , ls , ans , n);
        ls.remove(ls.size() - 1);
        helper(arr, i+1 , ls , ans , n);
    }
}