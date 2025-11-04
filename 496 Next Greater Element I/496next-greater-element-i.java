import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(); // store each num2[i] → its next greater element
        Stack<Integer> st = new Stack<>();

        // Traverse nums2 from right to left
        for (int i = nums2.length - 1; i >= 0; i--) {
            // pop all smaller or equal elements — they can’t be NGE
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }

            // if stack empty, then no greater element
            int nextGreater = st.isEmpty() ? -1 : st.peek();

            // store mapping
            map.put(nums2[i], nextGreater);

            // push current element
            st.push(nums2[i]);
        }

        // Build result for nums1
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}
