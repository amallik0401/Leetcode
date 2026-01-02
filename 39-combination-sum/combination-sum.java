class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    int target;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.target = target;

        BT(candidates , 0 , new ArrayList<>() , 0);

        return ans;
    }

    void BT(int [] candidates ,int idx , List<Integer> comb , int sum)
    {
        if(sum == target)
        {
            ans.add(new ArrayList<>(comb));
            return;
        }

        if(sum > target || idx >= candidates.length)
        {
            return;
        }

        comb.add(candidates[idx]);
        BT(candidates , idx , comb , sum + candidates[idx]);
        comb.remove(comb.size()-1);
        BT(candidates , idx+1 , comb , sum);
    }
}