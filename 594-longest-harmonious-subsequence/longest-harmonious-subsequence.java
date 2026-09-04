class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        int maxlen = 0;
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        for(int key:m.keySet()){
            if(m.containsKey(key+1)){
                maxlen = Math.max(maxlen,m.get(key)+m.get(key+1));
            }
        }
        return maxlen;
    }
}