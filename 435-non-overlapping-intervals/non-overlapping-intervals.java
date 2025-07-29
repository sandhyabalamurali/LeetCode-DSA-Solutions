import java.util.Arrays;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // Step 1: Sort intervals by end time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;       // Number of intervals to remove
        int lastEnd = Integer.MIN_VALUE;

        for (int[] interval : intervals) {
            if (interval[0] < lastEnd) {
                // Overlapping → remove it
                count++;
            } else {
                // No overlap → update end time
                lastEnd = interval[1];
            }
        }

        return count;
    }
}
