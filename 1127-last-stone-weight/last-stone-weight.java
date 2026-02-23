class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i : stones)
        {
            maxHeap.add(i);
        }

        while(!maxHeap.isEmpty() && maxHeap.size() != 1)
        {
            int a = maxHeap.poll();
            int b = maxHeap.poll();

            if(a!=b)
            {
                maxHeap.add(a-b);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}