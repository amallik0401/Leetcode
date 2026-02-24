class Solution {
    public int[][] insert(int[][] intervals, int[] nI) {

        int n = intervals.length;
        int[][] merged = new int[n+1][];
        for(int i = 0 ; i < n ; i++)
        {
            merged[i] = intervals[i];
        }
        merged[n] = nI;

        Arrays.sort(merged , (a,b) -> Integer.compare(a[0],b[0]));

        
        List<int[]> merge = new ArrayList<>();
        int [] prev = merged[0];

        for(int i = 1 ; i<= n ; i++)
        {
            int[]interval = merged[i];
            if(interval[0] <= prev[1])
            {
                prev[1] = Math.max(prev[1] , interval[1]);
            }
            else
            {
                merge.add(prev);
                prev = interval;
            }
        }

        merge.add(prev);

        return merge.toArray(new int[merge.size()][]);

    }
}