class Solution {
    List<Integer> list = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {

        BT(nums);
        
        return res;
    }

    void BT(int []nums )
    {
        if(list.size() == nums.length)
        {
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(list.contains(nums[i]))
                continue;
            
            list.add(nums[i]);
            BT(nums);
            list.remove(list.size()-1);
        }

    }
}