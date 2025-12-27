package com.leetcode.coding.questions;

/**
 * Given a string s, return the longest palindromic substring in s.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 */
public class PalindromicString {

    private boolean isPalindrome(String str, int i, int j) {
        while(i<=j) {
            if(str.charAt(i)==str.charAt(j)) {
                return isPalindrome(str,++i,--j);
            } else if(i==j) {
                return true;
            }
            return false;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int maxLength = 0;
        String maxPalindrone = null;
        for(int i=0;i<s.length();i++) {
            for(int j=i;j<s.length();j++) {
                if (isPalindrome(s, i, j)) {
                    String substring = s.substring(i, j + 1);
                    System.out.println("Palindrome : "+ substring);
                    if(substring.length()>maxLength) {
                        maxPalindrone=substring;
                        maxLength=substring.length();
                    }
                }
            }
        }
        return maxPalindrone;
    }
}
