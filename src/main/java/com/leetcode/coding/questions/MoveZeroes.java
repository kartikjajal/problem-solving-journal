package com.leetcode.coding.questions;

public class MoveZeroes {
    /*public void moveZeroes(int[] nums) {
        int nextFillIndex = 0;
        int currentIndex = 0;

        while (nextFillIndex <= nums.length-1 && currentIndex<=nums.length-1) {

            if(nums[currentIndex] != 0) {
                nums[nextFillIndex]=nums[currentIndex];
                if(currentIndex!=nextFillIndex)
                    nums[currentIndex]=0;
                nextFillIndex++;
                currentIndex++;

            } else {
                currentIndex++;
            }
        }
    }*/
    public void moveZeroes(int[] nums) {
        int nextIndexToFill = 0;
        int currentIndex = 0;

        while (currentIndex!= nums.length) {
            System.out.print(currentIndex);
            if(nums[currentIndex]!=0) {
                nums[nextIndexToFill++] = nums[currentIndex];
                nums[currentIndex]=0;
            }
            currentIndex++;
        }
    }
}
