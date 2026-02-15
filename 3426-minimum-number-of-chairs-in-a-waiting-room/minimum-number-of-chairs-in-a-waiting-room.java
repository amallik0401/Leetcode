class Solution {
    public int minimumChairs(String s) {
        int max = 0;
        int curr = 0;
        for(char i : s.toCharArray())
        {
            if(i == 'E')
                curr++;
            else
                curr--;

            max = Math.max(max , curr);
        }

        return max;
    }
}