package com.leetcode.coding.questions;

import java.util.HashMap;
import java.util.Map;

/**
 * Link : https://leetcode.com/problems/climbing-stairs/description/
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 *
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 *
 * Constraints:
 *
 * 1 <= n <= 45
 */
public class ClimbStairs {
    Map<Integer,Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        if(n==1) {
            return 1;
        } else if(n == 2) {
            return 2;
        }

        if(map.containsKey(n)) {
            return map.get(n);
        }
        int climbStairsOneStep = climbStairs(n - 1);
        int climbStairsTwoSteps = climbStairs(n - 2);
        int total=  climbStairsOneStep + climbStairsTwoSteps;
        map.put(n, total);
        return total;
    }

    public static void main(String[] args) {
        System.out.print(new ClimbStairs().climbStairs(45));
        //45=1836311903
    }
}
