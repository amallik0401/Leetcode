class Solution {
    public List<Integer> getGoodIndices(int[][] v, int target) {
        List<Integer> ls = new ArrayList<>();

        for(int i = 0 ; i < v.length ; i++)
        {
            int a = v[i][0];  
            int b = v[i][1];  
            int c = v[i][2];  
            int d = v[i][3];  
            int base = 1;

            for(int j = 0 ; j < b ; ++j)
                base = (base*a) % 10;

            int FR = 1;

            for(int j = 0 ; j < c ; ++j)
                FR = (FR * base) % d;

            if(FR == target)
                ls.add(i);
        }

        return ls;
    }
}