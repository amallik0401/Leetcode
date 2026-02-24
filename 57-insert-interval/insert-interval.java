class Solution {
    public int[][] insert(int[][] intervals, int[] nI) {

        List<int[]> merge = new ArrayList<>(Arrays.asList(intervals));
        merge.add(nI);
        Collections.sort(merge , (a,b) -> Integer.compare(a[0],b[0]));

        List<int []> res = new ArrayList<>();
        int [] prev = merge.get(0);

        for(int i = 1 ; i < merge.size() ; i++)
        {
            int[]interval = merge.get(i);
            if(interval[0] <= prev[1])
            {
                prev[1] = Math.max(prev[1] , interval[1]);
            }
            else
            {
                res.add(prev);
                prev = interval;
            }
        }

        res.add(prev);

        return res.toArray(new int[res.size()][]);

    }
}