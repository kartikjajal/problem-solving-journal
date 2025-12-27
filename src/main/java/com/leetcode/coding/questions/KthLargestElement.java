package com.leetcode.coding.questions;

import java.util.*;

/**
 * Link: https://leetcode.com/problems/kth-largest-element-in-an-array/description/
 *
 * Given an integer array nums and an integer k, return the kth largest element in the array.
 *
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 *
 * Can you solve it without sorting?
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,2,1,5,6,4], k = 2
 * Output: 5
 * Example 2:
 *
 * Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
 * Output: 4
 *
 *
 * Constraints:
 *
 * 1 <= k <= nums.length <= 105
 * -104 <= nums[i] <= 104
 */
public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> set = new PriorityQueue<>();

        for(int i=0;i<nums.length;i++) {
            set.add(nums[i]);
            if (set.size()>k) {
                set.poll();
            }
        }

        return set.poll();
    }
}
