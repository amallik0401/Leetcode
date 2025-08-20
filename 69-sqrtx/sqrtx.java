class Solution {
    public int mySqrt(int x) {
        double sqrt = Math.sqrt(x);

        int a = (int)Math.floor(sqrt);

        return a;
    }
}