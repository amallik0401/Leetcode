class Solution {
    List<Integer> list = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        BT(candidates , 0 , target);

        return ans;

    }

    void BT(int [] candidates , int start , int target)
    {
        if(target == 0)
        {
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = start ; i < candidates.length ; i++)
        {
            if(i>start && candidates[i] == candidates[i-1])
                continue;

            if(candidates[i]>target)
                break;
            
            list.add(candidates[i]);
            BT(candidates , i+1 , target - candidates[i]);
            list.remove(list.size() - 1);
        }
    }
}