class Solution {
    String digits;
    StringBuilder sb = new StringBuilder("");
    List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        this.digits = digits;
        String []arr = new String[10];

        arr[2] = "abc";
        arr[3] = "def";
        arr[4] = "ghi";
        arr[5] = "jkl";
        arr[6] = "mno";
        arr[7] = "pqrs";
        arr[8] = "tuv";
        arr[9] = "wxyz";

        BT(arr , 0 );

        return ans;
    }

    private void BT(String []arr , int i)
    {
        if(i == digits.length())
        {
            ans.add(sb.toString());
            return;
        }
        
        String letters = arr[(digits.charAt(i)) - '0'];
        for(char ch : letters.toCharArray())
        {
            sb.append(ch);
            BT(arr , i+1);
            sb.deleteCharAt(sb.length()-1);
        }
    } 
}