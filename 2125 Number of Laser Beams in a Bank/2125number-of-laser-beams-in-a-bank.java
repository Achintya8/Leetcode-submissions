class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0;   // number of devices in the previous non-empty row
        int ans = 0;

        for (String row : bank) {
            int count = 0;
            // count number of '1's in this row
            for (char c : row.toCharArray()) {
                if (c == '1') count++;
            }

            // if current row has devices
            if (count > 0) {
                ans += prev * count;  // beams formed with previous non-empty row
                prev = count;         // update previous for next valid row
            }
        }

        return ans;
    }
}
