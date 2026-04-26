class Solution {
    public boolean isNumber(String s) {
        boolean seenDigit = false;
        boolean seenDot = false;
        boolean seenE = false;
        
        s = s.trim(); // Although LeetCode usually handles whitespace now
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];

            if (Character.isDigit(c)) {
                seenDigit = true;
            } else if (c == '+' || c == '-') {
                // Sign only at start or after 'e'
                if (i > 0 && arr[i-1] != 'e' && arr[i-1] != 'E') return false;
            } else if (c == '.') {
                // Dot only once and NOT after 'e'
                if (seenDot || seenE) return false;
                seenDot = true;
            } else if (c == 'e' || c == 'E') {
                // 'e' only once and must have a digit before it
                if (seenE || !seenDigit) return false;
                seenE = true;
                seenDigit = false; // Reset to ensure a digit follows 'e'
            } else {
                return false; // Any other character is invalid
            }
        }

        return seenDigit; // Must end having seen at least one digit (esp. after 'e')
    }
}