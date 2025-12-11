class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {

        int sec = 0;        
        for(int i = 0 ; i < points.length-1 ; i++)
        {   
            int dx = points[i][0] - points[i+1][0];
            int dy = points[i][1] - points[i+1][1];

            dx = Math.abs(dx);
            dy = Math.abs(dy);

            sec += Math.max(dx,dy);
        }
        return sec;
    }
}