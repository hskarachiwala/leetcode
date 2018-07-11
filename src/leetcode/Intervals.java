package leetcode;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Intervals {

      public static class Interval {
          int start;
          int end;
          public Interval() { start = 0; end = 0; }
          public Interval(int s, int e) { start = s; end = e; }
      }

    public static class IntervalComparator implements Comparator<Interval> {
        @Override
        public int compare(Interval intervalOne, Interval intervalTwo) {
            return intervalOne.start - intervalTwo.start;
        }
    }

    public static List<Interval> merge(List<Interval> intervals) {
        PriorityQueue queue = new PriorityQueue<Interval>(new IntervalComparator());
        for(Interval interval : intervals) {
            queue.offer(interval);
        }
        List<Interval> result = new LinkedList<Interval>();
        Interval prev = (Interval)queue.poll();
        result.add(prev);
        while(!queue.isEmpty()) {
            Interval current = (Interval)queue.poll();
            if(current.start<=prev.end) {
                if(prev.end<current.end) {
                    prev.end = current.end;
                }
            } else {
                result.add(current);
                prev = current;
            }
        }
        return result;
    }
}
