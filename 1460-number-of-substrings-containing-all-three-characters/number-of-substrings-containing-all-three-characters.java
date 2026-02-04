class Solution {
    public int numberOfSubstrings(String s) {

        int len = s.length();
        int total = 0;
        int []arr = {-1, -1, -1};
        for(int i = 0 ; i < len ; i++)
        {
            arr[s.charAt(i) - 'a'] = i;

            total += 1 + Math.min(arr[0] , Math.min(arr[1] , arr[2])); 
        }
        return total;
    }
}