class Solution {
    public int smallestNumber(int n) {
        while(true)
        {
            String temp = Integer.toBinaryString(n);

            if(!temp.contains("0"))
            {
                return n;
            }
            n++;
        }
    }
}