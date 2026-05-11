class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            String a = String.valueOf(nums[i]);
            for (int j = 0; j < a.length(); j++) {
                ans.add(Integer.parseInt(String.valueOf(a.charAt(j))));
            }
        }
        int[] an = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            an[i] = ans.get(i);
        }

        return an;
    }
}