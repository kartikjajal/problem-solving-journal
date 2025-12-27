package com.leetcode.coding.questions;

import java.util.Arrays;

/*

Problem :- Check if the array is balanced array or not.
Description:- A balanced array is defined to be an array where for every value n in the array, -n also is in the array.
Example 1:- {-2, 3, 2, -3} is a balanced array.
Example 2:- {1,1,-1,-1} is a balanced array.
Example 3:- {1,1,-1} is a NOT balanced array.
Example 4:- {-2, 3, 2, -3, 0, 5,-5} is a balanced array.
Example 5:- {1, 2, -3} is NOT a balanced array.
Example 6:- {-3,-2, -3, -2, 4, 1, 4, 1 , 3, 2, -4, -1} is NOT a balanced array
Note:-

1. Zeroes can be ignored.
2. There can be duplicates in the array. Every duplicate n needs to have -n
 */
public class Solution {

    public static void main(String[] args) {
        int []arr1 = {-2, 3, 2, -3};
        int []arr2 = {1,1,-1,-1};
        int []arr3 = {1,1,-1};
        int []arr4 = {-2, 3, 2, -3, 0, 5,-5};
        int []arr5 = {1, 2, -3};
        int []arr6 = {-3,-2, -3, -2, 4, 1, 4, 1 , 3, 2, -4, -1};

        System.out.println(isBalancedArray(arr1));
        System.out.println(isBalancedArray(arr2));
        System.out.println(isBalancedArray(arr3));
        System.out.println(isBalancedArray(arr4));
        System.out.println(isBalancedArray(arr5));
        System.out.println(isBalancedArray(arr6));
    }
    public static boolean isBalancedArray(int nums[]) {

        Arrays.sort(nums);
        for(int i = 0; i<nums.length-1; i++) {
            int j = nums.length-(i+1);
            if(nums[i]+nums[j]!=0) {
                return false;
            }
        }
        return true;
    }
}
