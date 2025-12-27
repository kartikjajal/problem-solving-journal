package com.leetcode.coding.questions;

public class StringTest {
    public static void main(String[] args) {

        int []nums = new int[5];
        int result = nums[0]<nums[1] && nums[1]>nums[2] ? 1 : 0;
        int maxLength=0;
        String str = "pwwkew";
        for(int i=0; i<str.length()-1;i++){
            int temp = str.substring(i, str.indexOf(str.charAt(i),i+1)).length();
            if(temp>maxLength){
                maxLength=temp;
            }
        }
        System.out.println(maxLength);
    }
}
