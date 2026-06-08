class Solution {
    public boolean consecutiveSetBits(int n) {
       int overlaps = n & (n >> 1);
        return Integer.bitCount(overlaps) == 1;
    }
}