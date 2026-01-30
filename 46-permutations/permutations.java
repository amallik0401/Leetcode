class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        helper(nums , ls , ans);

        return ans;
    }

    void helper(int [] arr ,List<Integer> ls , List<List<Integer>> ans)
    {
        if(ls.size() == arr.length)
        {
            ans.add(new ArrayList<>(ls));
            return;
        }
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(ls.contains(arr[i]))
                continue;
            
            ls.add(arr[i]);
            helper(arr, ls , ans);
            ls.remove(ls.size()-1);
        }
    }
}