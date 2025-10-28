class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                if (isValid(nums, i, 1)) count++;   // move right
                if (isValid(nums, i, -1)) count++;  // move left
            }
        }
        return count;
    }

    private boolean isValid(int[] nums, int start, int dir) {
        int[] temp = nums.clone();
        int curr = start;

        while (curr >= 0 && curr < temp.length) {
            if (temp[curr] == 0) {
                curr += dir;  // move in same direction
            } else {
                temp[curr]--;   // decrement value
                dir = -dir;     // reverse direction
                curr += dir;    // move
            }
        }

        // check if all became zero
        for (int val : temp) {
            if (val != 0) return false;
        }
        return true;
    }
}
