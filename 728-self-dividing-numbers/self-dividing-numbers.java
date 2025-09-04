class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList<>();
        int digit;
        for(int i = left ; i <=right ; i++ )
        {
            int num = i;
            boolean res = true;
            while(num>0)
            {
                digit = num%10;
                num/=10;

                if(digit==0 || i%digit!=0 )
                {
                    res = false;
                    break;
                }
            }
            if(res)
                list.add(i);       
        }
        return list;
    }
}