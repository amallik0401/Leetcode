class Solution {
    public long ans =0;
    public long minimumFuelCost(int[][] roads, int seats) {
        
        int n = roads.length;
        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0 ; i <= n ; i++)
            adj.add(new ArrayList<>());

        for(int i = 0 ; i < n ; i++)
        {
            int u = roads[i][0];
            int v = roads[i][1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean [] vis = new boolean[n+1];

        dfs(0, adj , vis , seats);

        return ans;
    }

    long dfs(int start , List<List<Integer>> adj , boolean[]vis , int seats)
    {
        vis[start] = true;
        int count = 1;
        for(int i : adj.get(start))
        {
            if(!vis[i])
            {
                count += dfs(i , adj , vis , seats);
            }
        }

        if(start != 0)
        {
            long car = count/seats;
            if(count%seats !=0)car++;

            ans += car;
        }

        return count;
    }
}