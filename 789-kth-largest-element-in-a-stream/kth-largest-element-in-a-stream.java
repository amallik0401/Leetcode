class KthLargest {

    List<Integer> ls = new ArrayList<>();
    int n,k;
    public KthLargest(int k, int[] nums) {

        this.k = k;
        for(int x : nums)
        {
            ls.add(x);
        }
    }
    
    public int add(int val) {
        n = ls.size();

        ls.add(val);
        
        Collections.sort(ls);

        return ls.get(n-k+1);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */