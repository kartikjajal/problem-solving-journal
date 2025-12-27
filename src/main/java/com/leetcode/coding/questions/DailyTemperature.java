package com.leetcode.coding.questions;

import java.util.Stack;

/**
 * Link : https://leetcode.com/problems/daily-temperatures/description/
 * Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.
 *
 *
 *
 * Example 1:
 *
 * Input: temperatures = [73,74,75,71,69,72,76,73]
 * Output: [1,1,4,2,1,1,0,0]
 * Example 2:
 *
 * Input: temperatures = [30,40,50,60]
 * Output: [1,1,1,0]
 * Example 3:
 *
 * Input: temperatures = [30,60,90]
 * Output: [1,1,0]
 *
 *
 * Constraints:
 *
 * 1 <= temperatures.length <= 105
 * 30 <= temperatures[i] <= 100
 */
public class DailyTemperature {
   /* public int[] dailyTemperatures(int[] temperatures) {
        int[] results = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<temperatures.length; i++) {
            while (!stack.empty() && temperatures[i]>temperatures[stack.peek()]) {
                results[stack.peek()]=i-stack.pop();
            }
            stack.push(i);
        }
        return results;
    }*/

    public int[] dailyTemperatures(int[] temperatures) {
        int result [] = new int[temperatures.length];

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                result[stack.peek()] = i-stack.pop();
            }
            stack.push(i);
        }

        return result;
    }
}
