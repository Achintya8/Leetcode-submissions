class Solution {
    public void reverseString(char[] s) {
        int n=s.length-1;
        int i=0;
        char tmp;
        while(i<n){
            tmp  = s[i];
            s[i] = s[n];
            s[n] = tmp;
            i++;
            n--;
        }
    }
}