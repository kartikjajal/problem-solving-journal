package com.leetcode.coding.questions;

import java.util.Arrays;

/**
 * Link : https://leetcode.com/problems/maximum-subarray/description/
 * https://cyberw1ng.medium.com/kadanes-algorithm-the-efficient-way-to-find-maximum-subarray-sum-2023-f67b42236bde
 *
 * Given an integer array nums, find the subarray with the largest sum, and return its sum.
 *
 * Example 1:
 *
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 * Example 2:
 *
 * Input: nums = [1]
 * Output: 1
 * Explanation: The subarray [1] has the largest sum 1.
 * Example 3:
 *
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 * Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 */
public class MaxSubArraySum {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, maxCurrent=0;
        int start=0, end=0;
        for(int i=0;i<nums.length;i++) {
            maxCurrent+=nums[i];
            if(maxSum<maxCurrent) {
                maxSum=maxCurrent;
                end = i;
            }
            if(maxCurrent<0) {
                maxCurrent=0;
                start=i+1;
            }
        }
        System.out.println(start+" , "+end);
        //Arrays.stream(nums).skip(start).limit(end+1-start).forEach(System.out::print);
        return  maxSum;
    }
}
