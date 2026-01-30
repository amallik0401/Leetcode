class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        helper(nums , 0 , ls , ans);

        return ans;
    }

    void helper(int [] arr , int idx ,List<Integer> ls , List<List<Integer>> ans )
    {
        ans.add(new ArrayList<>(ls));

        for(int i = idx ; i < arr.length ;i++)
        {
            if(i>idx && arr[i]==arr[i-1])   continue;

            ls.add(arr[i]);
            helper(arr , i + 1 , ls , ans);
            ls.remove(ls.size() - 1);
        }
    }
}