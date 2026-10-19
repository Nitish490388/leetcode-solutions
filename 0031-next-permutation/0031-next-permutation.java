
class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        // Step 1: Find the pivot
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Step 2: Find the next greater element
            int j = nums.length - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }

            // Swap pivot with next greater element
            swap(nums, i, j);
        }

        // Step 3: Reverse the entire suffix
        reverse(nums, i + 1, nums.length - 1);
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private void reverse(int[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }
}
