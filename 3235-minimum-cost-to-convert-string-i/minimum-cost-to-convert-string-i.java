class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        
        long [][] graph = new long[26][26];
        long INF = Long.MAX_VALUE/2;

        for(long[]row : graph)
        {
            Arrays.fill(row,INF);
        }

        for(int i = 0 ; i < 26 ; i++)
        {
            graph[i][i] = 0;
        }

        for(int i = 0 ; i < original.length ; i++)
        {
            int u = original[i] - 'a';
            int v = changed[i] - 'a';

            graph[u][v] = Math.min(graph[u][v] , cost[i]);
        }

        for(int k = 0 ; k < 26 ; k++)
        {
            for(int i = 0 ; i < 26 ; i++)
            {
                if(graph[i][k] == INF) continue;
                for(int j = 0 ; j < 26 ; j++)
                {
                    if(graph[k][j] != INF)
                    {
                        graph[i][j] = Math.min(graph[i][j] , graph[i][k] + graph[k][j]);
                    }
                }
            }
        }

        long totalCost = 0;
        int n = source.length();

        for(int i = 0 ; i < n ; i++)
        {
            int u = source.charAt(i) - 'a';
            int v = target.charAt(i) - 'a';
            if(u==v)    continue;
            if(graph[u][v]==INF)    return -1;
            totalCost += graph[u][v];
        }

        return totalCost;
    }
}