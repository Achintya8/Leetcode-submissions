class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = people.length - 1; // Point to the heaviest person
        int cnt = 0;

        while (i <= j) {
            cnt++; // A boat will definitely be used in this iteration
            
            // Check if the lightest and heaviest can share
            if (people[i] + people[j] <= limit) {
                i++; // Lightest person gets on, move to next lightest
            }
            
            // The heaviest person ALWAYS gets on the boat
            j--; 
        }
        return cnt;
    }
}