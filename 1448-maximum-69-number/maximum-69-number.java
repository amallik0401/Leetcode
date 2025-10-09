class Solution {
    public int maximum69Number (int num) {
        
        int [] nums = new int[100];

        int i =0;
        while(num!=0)
        {
            nums[i] = num%10;
            num = num/10;
            i++;
        }

        for(int j = i-1 ; j>=0 ; j--)
        {
            if(nums[j]==6)
            {
                nums[j]=9;
                break;
            }
        }
        int res =0;
        for(int j = i-1 ; j>=0 ; j--)
        {
            res = nums[j] + res*10;
        }

        return res;


        
    }
}