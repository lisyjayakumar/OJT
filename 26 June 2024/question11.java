//11 Insert Interval
import java.util.ArrayList;

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}

public class question11 {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<Interval>();

        for (Interval interval : intervals) {
            if (interval.end < newInterval.start) {
                result.add(interval);
            } else if (interval.start > newInterval.end) {
                result.add(newInterval);
                newInterval = interval;
            } else if (interval.end >= newInterval.start || interval.start <= newInterval.end) {
                newInterval = new Interval(Math.min(interval.start, newInterval.start),
                                           Math.max(newInterval.end, interval.end));
            }
        }

        result.add(newInterval);
        return result;
    }

    public static void main(String[] args) {
        // Creating some intervals to test
        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(6, 9));

        // New interval to insert
        Interval newInterval = new Interval(2, 5);

        // Create an instance of Solution
        question11 solution = new question11();

        // Call insert method and print the merged intervals
        ArrayList<Interval> mergedIntervals = solution.insert(intervals, newInterval);
        for (Interval interval : mergedIntervals) {
            System.out.println("[" + interval.start + ", " + interval.end + "]");
        }
    }
}
