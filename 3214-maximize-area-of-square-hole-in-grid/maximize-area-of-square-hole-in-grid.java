class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        
        Arrays.sort(hBars);
        Arrays.sort(vBars);

        int hcurr = 1 , hmax = 1;
        int vcurr = 1 , vmax = 1;

        for(int i =  1 ; i < hBars.length ; i++)
        {
            if(hBars[i] == hBars[i-1]+1)
                hcurr++;
            else
                hcurr = 1;
            
            hmax = Math.max(hcurr , hmax);
        }
        for(int i =  1 ; i < vBars.length ; i++)
        {
            if(vBars[i] == vBars[i-1]+1)
                vcurr++;
            else
                vcurr = 1;
            
            vmax = Math.max(vcurr , vmax);
        }

        int side = Math.min(vmax , hmax) + 1;

        return side * side;
    }
}