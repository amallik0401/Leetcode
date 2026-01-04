class Solution {
    List<Integer> list = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        BT(nums,used);
        return ans;
    }

    void BT(int[]nums ,boolean [] used)
    {
        if(list.size() == nums.length)
        {
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = 0 ; i < nums.length ; i++)
        {   
            if(i>0 && nums[i]==nums[i-1] && !used[i-1] || (used[i]))
                continue;
            list.add(nums[i]);
            used[i] = true;
            BT(nums , used);
            list.remove(list.size()-1);
            used[i] = false;
        }
    }
}