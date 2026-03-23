class Solution {
    public int lengthOfLongestSubstring(String s) {
        int mac=0;
        int left=0;
        int right=0;

        if(s.isEmpty()){
            return 0;
        }else if(s.length()==1){
            return 1;
        }
        HashSet<Character> sa = new HashSet<>();
       // System.out.println(s.length());
        while(right<s.length()){
            if(!sa.contains(s.charAt(right))){
                sa.add(s.charAt(right));
                 mac= Math.max(mac,(right-left+1));
                right += 1;
            }else{
                sa.remove(s.charAt(left));
                left += 1;
               
            }
        }
        return mac;
    }
}