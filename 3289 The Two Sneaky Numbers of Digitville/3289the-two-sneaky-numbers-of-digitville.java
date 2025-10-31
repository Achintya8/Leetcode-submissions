import java.util.*;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        if (n == 0) return new int[0];

        // Mark counts by adding n to index positions
        for (int i = 0; i < n; i++) {
            int idx = nums[i] % n;   // original value even if nums[idx] has been increased
            nums[idx] += n;
        }

        // Collect indices that appeared more than once
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int count = nums[i] / n;
            if (count > 1) res.add(i);
        }

        // Optional: restore original array values (if you need the original array)
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] % n;
        }

        // Convert list to int[]
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) ans[i] = res.get(i);
        return ans;
    }
}
