class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> hs = new HashSet<>();

        for(int x : nums)
        {
            hs.add(x);
        }      
  
        return hs.size()!= nums.length;
    }
}