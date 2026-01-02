class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();

        for(int x : nums)
        {
            if(!map.containsKey(x))
            {
                map.put(x , 1);
            }
            else
            {
                map.put(x , map.get(x) +1);
            }
        }

        int a = nums.length / 2;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (a == entry.getValue()) {
                return entry.getKey();
            }
        }

        return -1;
    }
}