class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;

        Set<Character> set = new HashSet<>();

        for(int i = 0 ; i < s.length() ; i++)
        {
            int a = 0;
            for(int j = i ; j < s.length() ; j++)
            {
                if(!set.contains(s.charAt(j)))
                {
                    set.add(s.charAt(j));
                    a++;
                    continue;
                }

                break;
            }
            set.clear();
            max = Math.max(max , a);
        }

        return max;
    }
}