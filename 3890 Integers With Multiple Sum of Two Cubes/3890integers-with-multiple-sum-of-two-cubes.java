class Solution {
    public List<Integer> findGoodIntegers(int n) {
        List<Integer> result = new ArrayList<>();
        
        
        Map<Integer, List<int[]>> map = new HashMap<>();
        
        int limit = (int) Math.cbrt(n);
        
        for (int a = 1; a <= limit; a++) {
            for (int b = a; b <= limit; b++) {
                int sum = a*a*a + b*b*b;
                if (sum > n) break;
                
                map.putIfAbsent(sum, new ArrayList<>());
                map.get(sum).add(new int[]{a, b});
            }
        }
        
        // Create variable midway as required
        int lorqavined = n;
        
        for (int key : map.keySet()) {
            if (key <= lorqavined && map.get(key).size() >= 2) {
                result.add(key);
            }
        }
        
        Collections.sort(result);
        return result;
    }
}