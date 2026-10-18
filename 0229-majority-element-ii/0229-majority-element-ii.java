class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MIN_VALUE;

        int count1 = 0, count2 = 0;

        for (int n : nums) {
            if (n == num1) {
                count1++;
            } else if (n == num2) {
                count2++;
            } //New number
            else if (count1 == 0) {
                num1 = n;
                count1 = 1;
            } else if (count2 == 0) {
                num2 = n;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        int n = nums.length;
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] == num1)
                count1++;
            if (nums[i] == num2)
                count2++;
        }

        int mini = (int) (n / 3) + 1;
        if (count1 >= mini)
            ls.add(num1);
        if (count2 >= mini)
            ls.add(num2);

        return ls;
    }
}