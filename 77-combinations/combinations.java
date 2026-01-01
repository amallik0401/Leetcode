class Solution {
    public List<List<Integer>> combine(int n, int k) {

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();

    BT(1 , curr , ans , n , k);

    return ans;
    }

    void BT(int x , List<Integer> curr , List<List<Integer>> ans , int n , int k)
    {
        if(curr.size() == k)
        {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i = x ; i <= n ;i++)
        {
            curr.add(i);
            BT(i+1,curr , ans , n , k);
            curr.remove(curr.size()-1);
        }

    }
}