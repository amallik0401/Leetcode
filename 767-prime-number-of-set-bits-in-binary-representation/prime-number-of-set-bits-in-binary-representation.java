class Solution {
    static List<Integer> prime=new ArrayList<>(Arrays.asList(2,3,5,7,11,13,17,19,23,29,31));

    
    public static int countPrimeSetBits(int left, int right) {
        int ans=0;

        while(left<=right) {
            int bits = Integer.bitCount(left);
            if(prime.contains(bits)) ans++;
            left++;
        }

        return ans;
    }
}