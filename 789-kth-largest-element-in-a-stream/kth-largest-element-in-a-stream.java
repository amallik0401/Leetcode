class KthLargest {

    private PriorityQueue<Integer> nums;
    private int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = new PriorityQueue<>();

        for (int num : nums) {
            add(num);
        }
    }
    
    public int add(int val) {
        this.nums.offer(val);

        if (this.nums.size() > k) {
            this.nums.poll();
        }

        return this.nums.peek();

    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */