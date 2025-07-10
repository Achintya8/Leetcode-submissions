class Solution {
    public int[] twoSum(int[] numbers, int target) {
      HashMap<Integer,Integer> map = new HashMap<>();
      int n;
      for(int i=0;i<numbers.length;i++){
         n = target - numbers[i];
         if(map.containsKey(n)){
            return new int[]{map.get(n)+1,i+1};
         }
         map.put(numbers[i],i);
      }
      return new int[]{-1,-1};
    }
}