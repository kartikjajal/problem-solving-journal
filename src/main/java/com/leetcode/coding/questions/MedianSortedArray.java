package com.leetcode.coding.questions;

/**
 * Link : https://leetcode.com/problems/median-of-two-sorted-arrays/description/
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *
 * The overall run time complexity should be O(log (m+n)).
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * Example 2:
 *
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 *
 *
 * Constraints:
 *
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -106 <= nums1[i], nums2[i] <= 106
 */
public class MedianSortedArray {
    /*public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int []arr = new int[nums1.length+nums2.length];

        int i=0;
        int j=0;
        int k=0;

        while(k < nums1.length + nums2.length) {
            if(i<nums1.length && j<nums2.length && nums1[i]<nums2[j]){
                arr[k++]=nums1[i++];
            } else if(i<nums1.length && j<nums2.length){
                arr[k++]=nums2[j++];
            } else if(i>nums1.length-1) {
                arr[k++]=nums2[j++];
            } else if(j> nums2.length-1) {
                arr[k++]=nums1[i++];
            }
        }

        if(arr.length%2!=0) {
            int index = (int) Math.ceil(arr.length/2.0)-1;
            return arr[index];
        } else {
            int sum = arr[arr.length/2]+arr[(arr.length/2)-1];
            return  sum/2.0;
        }
    }*/

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result =0;

        int []array = new int[nums1.length+nums2.length];
        int left = 0, right = 0;
        for(int i=0; i<array.length;i++) {
            if(left<nums1.length && right <nums2.length && nums1[left] <nums2[right]) {
                array[i]=nums1[left++];
            } else if(left<nums1.length && right <nums2.length && nums1[left] >nums2[right]) {
                array[i]=nums2[right++];
            } else if(left>=nums1.length) {
                array[i]=nums2[right++];
            } else {
                array[i]=nums1[left++];
            }
        }

        if(array.length%2==1) {
            return array[(int)Math.ceil(array.length/2)];
        } else {
            int i = array[(int) Math.floor(array.length / 2 - 1)] + array[(int) Math.ceil(array.length / 2)];
            return i /2.0;
        }

        //return result;
    }
}
