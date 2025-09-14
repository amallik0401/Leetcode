class Solution {
    public int maximumCount(int[] nums) {
        int negCount=0;
        int posCount=0;
        for(int x:nums)
        {
            if(x>0)
            posCount++;
            else if(x<0)
            negCount++;
        }

        return Math.max(posCount,negCount);
        
    }
}