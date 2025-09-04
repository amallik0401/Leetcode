class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int[] new_arr = new int[(nums1.length) + (nums2.length)];

        int i=0, j=0, k=0;

        while (i<=nums1.length && j<=nums2.length) {
            if (i == n1) {
                while(j<nums2.length) new_arr[k++] = nums2[j++];
                break;
            } else if (j == nums2.length) {
                while (i<n1) new_arr[k++] = nums1[i++];
                break;
            }

            if (nums1[i] < nums2[j]) {
                new_arr[k++] = nums1[i++];
            } else {
                new_arr[k++] = nums2[j++];
            }
        }

        if (((nums1.length) + (nums2.length))%2==0) return (float)(new_arr[n/2-1] + new_arr[n/2])/2;
        else return new_arr[((nums1.length) + (nums2.length))/2];
    }
}