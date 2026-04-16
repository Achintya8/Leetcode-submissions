class Solution {
    public int firstUniqChar(String s) {
        int n= s.length();
        char[] sa = s.toCharArray();
        int[] freq = new int[26];
        for(char c:sa){
            freq[c-'a'] ++;
        }
        for(int i=0;i<sa.length;i++){
            if(freq[sa[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
}