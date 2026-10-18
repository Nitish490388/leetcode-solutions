class Solution {
    public boolean canJump(int[] nums) {
        int maxIndex = 0;
        int len = nums.length;
        int currEle;
        for (int i = 0; i < len; i++) {
            currEle = nums[i];

            if (currEle == 0 && nums[maxIndex] == 0 && maxIndex != len - 1 && i == maxIndex)
                return false;
            maxIndex = Math.max(maxIndex, i + currEle);

            if (maxIndex >= len - 1)
                return true;
        }

        return true;
    }
}