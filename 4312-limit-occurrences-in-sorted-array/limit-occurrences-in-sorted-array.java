import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        if (nums.length == 0) return new int[0];

        List<Integer> ans = new ArrayList<>();
        int cnt = 1;
        ans.add(nums[0]); 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                cnt++;
            } else {
                cnt = 1; 
            }

            if (cnt <= k) {
                ans.add(nums[i]);
            }
        }

      
        int[] a = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            a[i] = ans.get(i);
        }
        return a;
    }
}