class Solution {
    public String reverseWords(String s) {
       s= s.replaceAll("\\s+", " ");
       s=s.strip();
        String[] res = s.split("[^a-zA-Z0-9]");
        Collections.reverse(Arrays.asList(res));
        String ans = String.join(" ",res);
        return ans;
    }
}