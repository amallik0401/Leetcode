class Solution {
    List<String> ans = new ArrayList<>();
    public String findDifferentBinaryString(String[] nums) {
        Set<String> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            set.add(nums[i]);
        }
        int n = nums[0].length();

        comb(n , 0 , new StringBuilder());
        
        for(int i = 0 ; i < ans.size() ; i++)
        {
            if(!set.contains(ans.get(i)))
            {
                return ans.get(i);
            }
        }

        return "";

    }

    void comb(int n , int i , StringBuilder sb)
    {
        if(i==n)
        {
            ans.add(sb.toString());
            return;
        }

        sb.append("0");
        comb(n,i+1 , sb);
        sb.deleteCharAt(sb.length()-1);
        sb.append("1");
        comb(n , i+1,sb);
        sb.deleteCharAt(sb.length()-1);
    }
}