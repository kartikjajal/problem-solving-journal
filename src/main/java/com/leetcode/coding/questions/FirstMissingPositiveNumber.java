package com.leetcode.coding.questions;

import java.util.Arrays;

/**
 * Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
 *
 * You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,0]
 * Output: 3
 * Explanation: The numbers in the range [1,2] are all in the array.
 * Example 2:
 *
 * Input: nums = [3,4,-1,1]
 * Output: 2
 * Explanation: 1 is in the array but 2 is missing.
 * Example 3:
 *
 * Input: nums = [7,8,9,11,12]
 * Output: 1
 * Explanation: The smallest positive integer 1 is missing.
 */
public class FirstMissingPositiveNumber {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]>=2 || nums[nums.length-1]<=0) return 1;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]==nums[i-1]) continue;
            if((nums[i]>0 && nums[i-1]>0 && nums[i]!=nums[i-1]+1) ) {
                return nums[i-1]+1;
            } else if(nums[i-1]== 0 && nums[i]!=1) {
                return nums[i-1]+1;
            } else if (nums[i-1]<=0 && nums[i]>1) {
                return 1;
            }
        }
        return nums[nums.length-1]+1;
    }
}
