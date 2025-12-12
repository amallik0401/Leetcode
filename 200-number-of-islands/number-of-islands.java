class Solution {
    public int numIslands(char[][] gd) {
        
        int count = 0;

        for(int i = 0 ; i < gd.length ; i++)
        {
            for(int j = 0 ; j <gd[i].length ; j++)
            {
                if(gd[i][j]=='1')
                {
                    count++;
                    bfs(gd,i,j);
                }
            }
        }
        return count;

    }

    public void bfs(char[][] gd ,int i , int j)
    {
        if(i >= gd.length || i<0 || j>=gd[i].length || j<0 ||gd[i][j]=='0')
            return;
        
        gd[i][j]='0';
        bfs(gd , i+1,j);
        bfs(gd , i-1,j);
        bfs(gd , i,j+1);
        bfs(gd , i,j-1);

        return
;    }
}