class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int a:nums){
            list.add(a);
        }
        int cnt=0;
        while(!isSorted(list)){
            int index=0;
            int n = list.size();
            int sum = Integer.MAX_VALUE;
            for(int i=0;i<n-1;i++){
               int val = list.get(i)+list.get(i+1);
                if(val<sum){
                    sum = val;
                    index=i;
                }
            }
            list.set(index,sum);
            list.remove(index+1);
            cnt++;
        }
        return cnt;
    }
    public boolean isSorted(ArrayList<Integer> list){
        int n = list.size();
        for(int i=1;i<n;i++){
            if(list.get(i)<list.get(i-1)) return false;
        }
        return true;
    }
}