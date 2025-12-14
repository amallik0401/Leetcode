class Solution {
    public int longestMountain(int[] arr) {
        if(arr.length<3)
            return 0;

        int l , r;

        int res = 0;
        for(int i = 1 ; i<arr.length-1 ; i++)
        {
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1])
            {   
                l = r = i;

                while(l>0 && arr[l] > arr[l-1])
                {
                    l--;
                }
                while(r < arr.length-1 && arr[r] > arr[r+1])
                {
                    r++;
                }
                
                res = Math.max(res , r-l+1);
            }
        }

        return res;
    }
}