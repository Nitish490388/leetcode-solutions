class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0;
        int ans = 0;
        Set<Integer> set = new HashSet<Integer>();
        for(int n: nums) {
            set.add(n);
        }
        for(int n: set) {
            int current = n;

            if (!set.contains(current - 1)) {
                count = 0;
                while(set.contains(current)) {
                    count++;
                    current++;
                }
            }
            ans = Math.max(ans, count);
        }

        return ans;
    }
}