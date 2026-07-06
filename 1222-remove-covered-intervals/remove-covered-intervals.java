import java.util.Arrays;

class Solution {
    public int removeCoveredIntervals(int[][] inter) {
        Arrays.sort(inter, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]); // end descending
            }
            return Integer.compare(a[0], b[0]); // start ascending
        });

        int count = 0;
        int maxEnd = inter[0][1];

        for (int i = 1; i < inter.length; i++) {
            if (inter[i][1] <= maxEnd) {
                count++; // current interval is covered
            } else { // this will be the new max 
                maxEnd = inter[i][1];
            }
        }

        return inter.length - count;
    }
}