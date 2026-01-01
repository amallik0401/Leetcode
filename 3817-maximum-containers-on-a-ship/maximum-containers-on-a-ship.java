class Solution {
    public int maxContainers(int n, int w, int maxWeight) 
    {
        int atmost = Math.min(n*n , maxWeight/w);

        return atmost;
    }
}