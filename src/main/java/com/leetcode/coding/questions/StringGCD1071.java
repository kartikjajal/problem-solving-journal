package com.leetcode.coding.questions;

public class StringGCD1071 {

    public static void main(String[] args) {
        String gcd = new StringGCD1071().gcd("LEET","CODE");
        System.out.println(gcd);
    }

    public String gcd(String input1, String input2) {
        String temp = input1.length()>input2.length() ? input1 : input2;
        int index = temp.length();
        String gcd="";
        while(index>0) {
            if(input1.replace(temp,"") == ""
                && input2.replace(temp,"") == "") {
                return temp;
            }
            index--;
            temp=temp.substring(0,index);
        }
        return gcd;
    }
}
