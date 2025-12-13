class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length ; i++)
        {

            if(i>0 && nums[i] == nums[i-1])
                continue;

            int l = i+1;
            int r = nums.length-1;

            int idx = nums[i];

            while(l<r)
            {
                int ans = idx + nums[l] + nums[r];

                if(ans<0)
                    l++;
                else if(ans>0)
                    r--;
                else
                {
                    ls.add(List.of(idx , nums[l] , nums[r]));

                    l++;
                    while(l<r && nums[l] == nums[l-1])
                    {
                        l++;
                    }
                }
            }
        }

        return ls;
        
    }
}