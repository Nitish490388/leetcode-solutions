class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];

        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }

        int left = 1;
        int right = max;
        int ans = max;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long hours = 0;

            for (int n : piles) {
                hours += (n + (long) mid - 1) / mid;
            }

            if (hours > h) {
                left = mid + 1;
            } else {
                ans = mid;
                right = mid - 1;
            }
        }

        return ans;
    }
}