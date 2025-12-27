package com.leetcode.coding.questions;

public class Reverse {
    public static void main(String[] args) {
        //new Reverse().rotate(new int[]{1,2,3,4,5,6,7});
        new Reverse().rotate(new int[]{1,2,3,4,5,6,7,8});
    }
    public void rotate(int[] nums) {
        for (int i = 0;i<(nums.length/2);i++){
            int temp=nums[(nums.length-1)-i];
            nums[(nums.length-1)-i]=nums[i];
            nums[i]=temp;
        }

        for (int x:nums){
            System.out.print(x);
        }
    }
}
