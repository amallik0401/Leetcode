class Solution {
    public int minimumPairRemoval(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        int count = 0;

        for(int x : nums)
        {
            list.add(x);
        }

        while(!checkSorted(list))
        {
            int min = Integer.MAX_VALUE;
            int a =0, b=1;
            for(int i = 1 ; i < list.size() ; i++)
            {
                int sum = list.get(i) + list.get(i-1);
                if(sum<min)
                {
                    a = i-1;
                    b = i;
                    min = sum;
                }
            }

            list.remove(b);
            list.remove(a);
            list.add(a , min);

            count++;
        }

        return count;

    }

    boolean checkSorted(List<Integer> list)
    {
        for(int i= 1 ; i < list.size() ; i++)
        {
            if(list.get(i)<list.get(i-1))
                return false;
        }

        return true;
    }
}