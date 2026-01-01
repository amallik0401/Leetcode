class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    int k ;
    public List<List<Integer>> combine(int n, int k) {
        this.k = k;
    List<Integer> curr = new ArrayList<>();

    BT(1 , curr ,n );

    return ans;
    }

    void BT(int x , List<Integer> curr , int n )
    {
        if(curr.size() == k)
        {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for(int i = x ; i <= n ;i++)
        {
            curr.add(i);
            BT(i+1,curr , n );
            curr.remove(curr.size()-1);
        }

    }
}