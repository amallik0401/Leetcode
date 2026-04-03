class Solution {
    public void reverseString(char[] s) {
        int l = 0 , e = s.length-1;

        while(l<e)
        {
            char temp = s[l];
            s[l] = s[e];
            s[e]=temp;
            l++;
            e--;
        }
    }
}