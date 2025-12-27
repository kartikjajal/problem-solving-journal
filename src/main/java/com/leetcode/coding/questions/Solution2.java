package com.leetcode.coding.questions;

import java.util.Arrays;

/*
Problem:- Rotate an array to the left or right direction by count k.
Examples:
Input :- Array = [1,2,3,4,5,6,7], direction = left, k = 1 Output :- Array = [2,3,4,5,6,7,1]
Input :- Array = [1,2,3,4,5,6,7], direction = left, k = 2 Output :- Array = [3,4,5,6,7,1,2]
Input :- Array = [1,2,3,4,5,6,7], direction = left, k = 8 Output :- Array = [2,3,4,5,6,7,1]
Input :- Array = [1,2,3,4,5,6,7], direction = right, k = 3 Output :- Array = [5,6,7,1,2,3,4]
Input :- Array = [1,2,3,4,5,6,7], direction = right, k = 1 Output :- Array = [7,1,2,3,4,5,6]
Note: Treat array as a circular array where it can be rotated even if the number of rotations is more than the length of the array.
 */
public class Solution2 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int result1[] =shift(nums1, "left", 1 );
        System.out.println("Input : "+ Arrays.toString(nums1)+" output : "+Arrays.toString(result1));

        int[] nums2 = {1, 2, 3, 4, 5, 6, 7};
        int result2[] =shift(nums1, "left", 2 );
        System.out.println("Input : "+ Arrays.toString(nums2)+" output : "+Arrays.toString(result2));

        int[] nums3 = {1, 2, 3, 4, 5, 6, 7};
        int result3[] =shift(nums1, "left", 8 );
        System.out.println("Input : "+ Arrays.toString(nums3)+" output : "+Arrays.toString(result3));

        int[] nums4 = {1, 2, 3, 4, 5, 6, 7};
        int result4[] =shift(nums1, "right", 3 );
        System.out.println("Input : "+ Arrays.toString(nums4)+" output : "+Arrays.toString(result4));

        int[] nums5 = {1, 2, 3, 4, 5, 6, 7};
        int result5[] =shift(nums1, "right", 1 );
        System.out.print("Input : "+ Arrays.toString(nums5)+" output : "+Arrays.toString(result5));

    }

    static int [] shift(int []nums,String direction, int k){
        if(k>nums.length) k=nums.length%k;
        if(direction.equals("left")) k=nums.length-k;

        int sliceAt = nums.length-k;
        int []arr = new int[nums.length];
        for(int i=0; i<k; i++){
            arr[i]=nums[sliceAt+i];
        }
        int j=0;
        for (int i=k; i<nums.length;i++) {
            arr[i]=nums[j++];
        }

        return arr;
    }
}

