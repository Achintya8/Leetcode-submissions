

class Solution {
    public int thirdMax(int[] nums) {
        // 1. Sort ascending
        Arrays.sort(nums);
        
        // 2. Reverse to descending
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }

        // 3. Find the third distinct maximum
        int count = 1; // We start by counting the first element (the max)
        for (int i = 1; i < nums.length; i++) {
            // Only increment count if the current number is different from the previous
            if (nums[i] != nums[i - 1]) {
                count++;
            }
            
            // As soon as we hit the 3rd distinct number, return it
            if (count == 3) {
                return nums[i];
            }
        }

        // 4. Fallback: If we finish the loop without finding a 3rd, return the 1st
        return nums[0];
    }
}