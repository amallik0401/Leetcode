class Solution {
    List<Integer> prime=new ArrayList<>(Arrays.asList(2,3,5,7,11,13,17,19,23,29,31));
    

    // public int binary(int num) {
    //     int count=0;
    //     // String s="";
    //     while(num!=0) {
    //         int r=num%2;
    //         if(r==1) count++;
    //         // s=r+s;
    //         num=num/2;
    //     }
    //     return count;
    // }
    
    public int countPrimeSetBits(int left, int right) {
        int ans=0;

        while(left<=right) {
            int bits = Integer.bitCount(left);
            if(prime.contains(bits)) ans++;
            left++;
        }

        return ans;
    }
}