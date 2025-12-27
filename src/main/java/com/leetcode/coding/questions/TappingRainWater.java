package com.leetcode.coding.questions;

/**
 * Link : https://leetcode.com/problems/trapping-rain-water/
 *
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
 *
 *Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
 * Example 2:
 *
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 *
 */
public class TappingRainWater {
    public int trap(int[] height) {
        int waterLevel=0;
        int r = height.length-1;
        int l = 0;

        int leftMax = 0;
        int rightMax = 0;

        while (l<r) {

            if (height[l]<height[r]) {
                waterLevel+=r-l;
                leftMax = Math.max(leftMax, height[l]);
                l++;
            } else {
                rightMax=Math.max(rightMax, height[r]);
                r--;
            }
        }

        return waterLevel;
    }
}
