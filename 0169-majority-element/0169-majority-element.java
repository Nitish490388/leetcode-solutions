class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        int ans = 0;

        for(int n: nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
            if(map.get(n) > len/2) {
                ans = n;
            }
        }

        return ans;
        
    }
}