class Solution {
    public int gcdOfOddEvenSums(int n) {

        int odd = 1;
        int even = 2;
        int oddSum=0;
        int evenSum=0;

        while(n>0)
        {
            oddSum += odd;
            evenSum += even;
            odd+=2;
            even+=2;
            n--;
        }
        return gcd(oddSum, evenSum);
        
    }
    int gcd(int a, int b)
    {
        if(a>b)
            return gcd(b ,a);
        
        while(a != 0)
        {
            int temp = a;
            a = b%a;
            b = temp;
        }

        return b;
    }
}