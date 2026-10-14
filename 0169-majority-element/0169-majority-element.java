class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = Integer.MIN_VALUE;
        int count = 0;
        for(int n: nums) {
            if(count == 0) {
                majorityElement = n;
                count++;
            }
            else {
                if(n == majorityElement) {
                    count ++;
                } else count --;
            }
        }

        return majorityElement;
    }
}