package com.leetcode.coding.questions;

import java.util.Map;
import java.util.Stack;

/**
 * 20. Valid Parenthesesg
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */
public class ValidParentheses {
    Map<Character,Character> parentheses = Map.of(
            ')','(',
            ']','[',
            '}','{'
    );

    public boolean isValid(String s) {

        if(s.length()%2!=0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length();i++) {
            if(isClosingParentheses(s, i)) {
                if (stack.isEmpty() || stack.peek()!=parentheses.get(s.charAt(i))) {
                    return false;
                } else {
                    stack.pop();
                }
            } else {
                stack.push(s.charAt(i));
            }
        }

        return stack.isEmpty();

    }

    private boolean isClosingParentheses(String s, int i) {
        return parentheses.get(s.charAt(i)) != null;
    }
}
