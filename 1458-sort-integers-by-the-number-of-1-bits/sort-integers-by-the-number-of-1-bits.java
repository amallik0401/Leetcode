class Solution {
    public int[] sortByBits(int[] arr) {

        Arrays.sort(arr);
        int n = arr.length;
        int[][] bit = new int[n][2];

        for(int i = 0 ; i < n ; i++)
        {
            bit[i][0] = Integer.bitCount(arr[i]);
            bit[i][1] = arr[i];
        }

        Arrays.sort(bit , (a,b)-> Integer.compare(a[0] , b[0]));

        for(int i = 0 ; i < n ; i++)
        {
            System.out.println(bit[i][1]);
            arr[i] = bit[i][1];
        }
        return arr;
    }
}