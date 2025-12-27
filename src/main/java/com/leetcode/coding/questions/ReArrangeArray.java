package com.leetcode.coding.questions;

public class ReArrangeArray {
    public int[] rearrangeArray(int[] nums) {
        int []positive = new int[nums.length];
        int []negative = new int[nums.length];

        int p=0;
        int n=0;

        for(int i=0;i<nums.length;i++) {
            if(nums[i] < 0) {
                negative[n++]=nums[i];
            } else {
                positive[p++]=nums[i];
            }
        }

        int min = Math.min(p,n);

        int counter = 0;
        for(int i=0; i<min; i++) {
            nums[counter++]=positive[i];
            nums[counter++]=negative[i];
        }

        for(int i=counter; i<nums.length;i++) {
            if(min==p) {
                nums[counter++]=positive[i];
            } else {
                nums[counter++]=negative[i];
            }
        }
        return nums;
    }
}
