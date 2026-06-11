class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        char[] patterns = pattern.toCharArray();
        if (patterns.length != words.length) {
            return false;
        }
        HashMap<Character, String> m = new HashMap<>();

        for (int i = 0; i < patterns.length; i++) {
            if (m.containsKey(patterns[i])) {
                if (!m.get(patterns[i]).equals(words[i])) {
                    return false;
                }
            } else {
                if (m.containsValue(words[i])) {
                    return false;
                }
                m.put(patterns[i], words[i]);
            }
        }
        return true;
    }
}