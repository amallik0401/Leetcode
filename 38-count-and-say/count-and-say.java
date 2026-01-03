class Solution {
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        
        String []arr = new String[n+1];
        arr[1] = "1";

        for(int i = 2 ; i<=n ; i++)
        {
            arr[i] = helper(arr[i-1]);
        }
        return arr[n];
    }

    String helper(String s)
    {
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i < s.length(); i++)
        {
            int count = 1;
            while(i < s.length()-1 && s.charAt(i)==s.charAt(i+1) )
            {
                count++;
                i++;
            }
            sb.append(String.valueOf(count));
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}