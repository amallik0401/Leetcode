class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {

        long ways = 0;
        long pencost = 0 ; 

        while(pencost <= total)
        {
            long remaining = total - pencost;
            long pencils = remaining / cost2 +1;
            ways += pencils;
            pencost += cost1;
        }

        return ways;
    }
}