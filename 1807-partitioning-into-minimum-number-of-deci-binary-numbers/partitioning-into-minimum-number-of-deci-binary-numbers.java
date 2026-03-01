class Solution {
    public int minPartitions(String n) {
        int max = 0;

        for(char i : n.toCharArray())
        {
            int m = i - '0';

            if(m>max)
                max = m;
        }

        return max;
    }
}