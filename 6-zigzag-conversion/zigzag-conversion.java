class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows>= s.length())
        {
            return s;
        }

        List<List<Character>> mat = new ArrayList<>();

        int n = s.length();
        int i = 0;

        for(int r = 0 ; r < numRows ; r++)
        {
            mat.add(new ArrayList<>());
        }
        
        while(i<n)
        {
            for(int down = 0 ; down < numRows && i<n;down++)
            {
                mat.get(down).add(s.charAt(i++));
            }
            for(int up = numRows-2 ; i<n &&up>0 ;up--)
            {
                mat.get(up).add(s.charAt(i++));
            }
        }
        String res = "";
        for(i = 0 ; i <numRows ; i++)
        {
            for(int j = 0 ; j <mat.get(i).size() ; j++)
            {
                res+= mat.get(i).get(j);
            }
        }
        return res;
    }
}