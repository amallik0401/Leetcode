class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder sb = new StringBuilder("0");

        for(int i = 1 ; i < n ; i++)
        {
            String temp = sb.toString();

            sb.append("1");
            sb.append(invert(temp));
        }

        return sb.charAt(k-1);
    }

    String invert(String s)
    {
        StringBuilder c = new StringBuilder();

        for(char ch : s.toCharArray())
        {
            if(ch == '0')
            {
                c.append("1");
            }
            else
            {
                c.append("0");
            }
        }

        return c.reverse().toString();
    }
}