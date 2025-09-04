class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        ArrayList<Integer> list = new ArrayList<>();
        double ans = 0;

        for(int num: nums1)
        {
            list.add(num);
        }
        for(int num : nums2)
        {
            list.add(num);
        }

        Collections.sort(list);
        int count = list.size();

        if(count%2!=0)
            ans = (double) list.get((count-1)/2);
        else
        {
            int first = count / 2;
            int second = (count - 1) / 2;
            ans = (double) (list.get(first) + list.get(second)) / 2;
        }

        return ans;
    }
}