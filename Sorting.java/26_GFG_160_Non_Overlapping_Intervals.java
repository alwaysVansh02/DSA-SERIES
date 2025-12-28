package Sorting;
    import java.util.Arrays;

public class Non_Overlapping_Intervals {

        public int minRemoval(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

            int count = 0;
            int prevEnd = intervals[0][1];
            for (int i = 1; i < intervals.length; i++) {
                if (intervals[i][0] < prevEnd) {
                    count++;
                } else {
                    prevEnd = intervals[i][1];
                }
            }
            return count;
        }
    public static void main(String[] args) {
        Non_Overlapping_Intervals obj = new Non_Overlapping_Intervals();
        int[][] intervals = { {1,3}, {2,4}, { 3,5} ,{6,7}};
        int result = obj.minRemoval(intervals);
        System.out.println("minimum numbers of intervals to remove:" + result);
    }
    }


