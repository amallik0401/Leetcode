class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;

        // Find the first decreasing element from end
        for(int i = n-2; i>=0; i--) {
            if(nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        //if no index found
        if(index == -1) {
            reverse(nums, 0, n-1);
            return;
        }

        //if index found
        for(int i = n-1; i > index; i--) {
            if(nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }
        
        //reverse part after index
        reverse(nums, index+1, n-1);

    }

    private void reverse(int arr[], int start, int end) {
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}