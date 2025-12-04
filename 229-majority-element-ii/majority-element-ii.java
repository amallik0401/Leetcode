class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;
        int a = n/3;
        List<Integer> ls = new ArrayList<>();
        Map<Integer , Integer> mp = new HashMap<Integer , Integer>();
        for(int x:nums)
        {
            if(ls.contains(x))
                continue;
            
            if(mp.containsKey(x))
                mp.put(x , mp.get(x)+1);

            else
                mp.put(x ,1);

            if(mp.get(x) >a)
            {
                    ls.add(x);
            }
        }
        return ls;
    }
}