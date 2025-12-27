package Sorting;
import java.util.ArrayList;
public class Insert_Interval {

        public ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {

            ArrayList<int[]> result = new ArrayList<>();

            int i = 0;
            int n = intervals.length;
            while (i < n && intervals[i][1] < newInterval[0]) {
                result.add(intervals[i]);
                i++;
            }
            while (i < n && intervals[i][0] <= newInterval[1]) {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]); 
                i++;
            }
            result.add(newInterval);
            while (i < n) {
                result.add(intervals[i]);
                i++;
            }

            return result;
        }

    public static void main(String[] args) {
        Insert_Interval obj = new Insert_Interval();
        int[] [] intervals = { {1,3} ,{6,9}};
        int [] newinterval = {2,3};
        ArrayList< int[]> result = new ArrayList<>( obj.insertInterval( intervals, newinterval ));
        System.out.println("The intervals after adding a new interval is :"  );
        for (int [] interval : result){
            System.out.println("[" + interval[0] + " , " + interval[1]);
        }
    }
    }


