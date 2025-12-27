package com.leetcode.coding.questions;

import java.util.*;
import java.util.stream.*;

/*
Given a collection of intervals, merge overlapping intervals.
An interval is represented by a pair of start and end times.
given the intervals [[1,3],[2,6],[8,10],[15,18]], the output
should be [[1,6],[8,10],[15,18]] since intervals [1,3] and [2,6] overlap
and should be merged into a single interval.

Input Intervals					                Merged Intervals
======================================================================================
[[1,3],[2,6],[8,10],[15,18]]	                [[1,6],[8,10],[15,18]]
[[1,4],[4,5]]					                [[1,5]]
[[1,3],[2,4],[5,7]]				                [[1,4],[5,7]]
[[1,4],[0,2],[3,5]]				                [[0,5]]
[[1,3],[4,6],[7,9]]				                [[1,3],[4,6],[7,9]]
[[1,2],[3,4],[5,6]]				                [[1,2],[3,4],[5,6]]
[[1,10],[2,5],[6,8],[9,12]]		                [[1,12]]
[[1, 3], [2, 6], [1, 4], [8, 10], [15, 18]]	    [[1, 6], [8, 10], [15, 18]]
[[8, 10], [2, 6], [1, 3], [15, 18], [1, 4]]	    [[1, 6], [8, 10], [15, 18]]
[[-2, 6], [1, 3], [-5, -1], [8, 10], [15, 18]]	[[-5, -1], [-2, 6], [8, 10], [15, 18]]
 */
public class L56_MergeIntervals {
    /*public int[][] overlappingIntervals(int [][]intervals) {
        int START_INDEX=0;
        int END_INDEX=1;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        System.out.println(Arrays.toString(intervals));
        LinkedList<int [][]> merged = new LinkedList<>();
        for(int i=0; i<intervals.length;i++) {
            if(merged.isEmpty()) {
                merged.add(new int[][] {intervals[i]});
            } else {
                int last [][] = merged.getLast();
                if(last[START_INDEX][END_INDEX] >= intervals[i][START_INDEX] && last[START_INDEX][END_INDEX] < intervals[i][END_INDEX]){
                    last[START_INDEX][END_INDEX] = intervals[i][END_INDEX];
                }else if(last[START_INDEX][END_INDEX] < intervals[i][START_INDEX]){
                    merged.add(new int[][] {intervals[i]});
                }
            }
        }
        int result [][] = new int[merged.size()][2];

       for(int i = 0; i<merged.size(); i++){
          int start = merged.get(i)[0][START_INDEX];
          int end = merged.get(i)[0][END_INDEX];
          result[i][START_INDEX]=start;
          result[i][END_INDEX]=end;
       }

       return result;
    }*/

        public int[][] overlappingIntervals(int [][]intervals) {
            Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));

            int START_INDEX=0, END_INDEX=1;
            LinkedList<int []> result = new LinkedList<>();
            for(int i=0;i<intervals.length;i++) {
                int start = intervals[i][START_INDEX];
                int end = intervals[i][END_INDEX];

                if(result.isEmpty()) {
                    result.add(new int[] {start, end});
                } else {
                    int [] lastScheduleTime = result.getLast();
                    // if start time is less and end time is higher
                    if(lastScheduleTime[START_INDEX] <= start && lastScheduleTime[END_INDEX] >= start) {
                        int [] lastSchedule = result.getLast();
                        result.removeLast();
                        result.add(new int [] {Math.min(lastSchedule[START_INDEX], start), Math.max(end, lastSchedule[END_INDEX])});

                        // if start time and end time fall between last schedule so skip it.
                    } else {
                        result.add(new int[] {start, end});
                    }
                }

            }
            return result.toArray(new int [0][0]);
        }
}
