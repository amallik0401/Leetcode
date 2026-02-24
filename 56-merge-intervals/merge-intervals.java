class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); 

        List<int[]> merge = new ArrayList<>();

        int []prev = intervals[0];

        for(int i = 1 ; i < intervals.length ; i++)
        {
            int [] interval = intervals[i];

            if(interval[0] <= prev[1])
            {
                prev[1] = Math.max(interval[1] , prev[1]);
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