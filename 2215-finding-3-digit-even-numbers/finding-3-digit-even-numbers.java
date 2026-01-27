class Solution {
    public int[] findEvenNumbers(int[] digits) {

        int n = digits.length;

        Set<Integer> ls = new TreeSet<>();

        for(int i =0 ; i < n ; i++)
        {
            if(digits[i]==0) continue;

            for(int j = 0 ; j < n ; j++)
            {
                if(i==j) continue;

                for(int k = 0 ; k < n ; k++)
                {
                    if(k == i || k == j) continue;

                    if(digits[k] % 2 != 0) continue;

                    int num = digits[i]*100 + digits[j]*10 + digits[k];

                    ls.add(num);
                }
            }
           
        }

        int ans [] = new int[ls.size()];
        int i = 0;
        for(int x: ls)
        {
            ans[i++] = x;
        }

        Arrays.sort(ans);

        return ans;
    }
}