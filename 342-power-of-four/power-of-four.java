class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;

        System.out.println(n);
        while(n%4==0) n/=4;

        return n==1;
    }
}