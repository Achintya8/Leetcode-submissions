class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int win = Integer.MAX_VALUE;
        int i = 0;
        int sum = 0;

        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            
            while (sum >= target) {
                win = Math.min(win, j - i + 1);
                sum -= nums[i];
                i++;
            }
        }

        return win == Integer.MAX_VALUE ? 0 : win;
    }
}