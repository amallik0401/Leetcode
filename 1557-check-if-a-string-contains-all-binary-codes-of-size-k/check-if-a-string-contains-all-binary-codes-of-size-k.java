class Solution {
    public boolean hasAllCodes(String s, int k) {
        
        int total = 1 << k ;

        Set<String> set = new HashSet<>();

        for(int i = 0 ; i <= s.length() - k ; i++)
        {
            set.add(s.substring(i , i+k));
        }

        return set.size() == total;
    }
}