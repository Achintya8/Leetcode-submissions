class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int p = prices.length-1;
        int d = discounts.length-1;

        double ans = 0 ;
        while(p>=0 && d>=0){
            ans += ((prices[p] * (100.0 - discounts[d])) / 100.0);
            p--;
            d--;
        }
        while(p>=0){
            ans += prices[p];
            p--;
        }
        return ans;
    }
}