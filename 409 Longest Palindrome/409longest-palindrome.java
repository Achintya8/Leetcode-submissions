class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> m = new HashMap<>();
        
        for(char c : s.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0) + 1);
        }

        int ans = 0;
        boolean hasOdd = false;

        for(int freq : m.values()) {
            ans += (freq / 2) * 2; // take even part

            if(freq % 2 == 1) {
                hasOdd = true;
            }
        }

        if(hasOdd) ans += 1; // one odd in center

        return ans;
    }
}