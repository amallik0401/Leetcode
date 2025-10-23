class Solution {
    public boolean hasSameDigits(String s) {
        int temp = 0; 

        char []ch = s.toCharArray();
        int len = ch.length;

        while(len!=2)
        {
            for(int i = 0;i<len-1;i++)
            {
                int a = (Character.getNumericValue(ch[i])+Character.getNumericValue(ch[i+1]))%10;
                ch[i] = (char)(a+'0');
            }
            len--;
        }
        System.out.println(ch[0]+" ,"+ch[1]);

        if(ch[0]==ch[1])
            return true;
        else
            return false;
    }
}