package com.leetcode.coding.questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Str {
    public static void main(String[] args) {
        //String str = "abcabcbb";
        //String str = "pwwkew";
        //String str = "dvdf";
        //String str = "bbbbb";
        String str = "abba";
        int max = maxSubLength(str);
        System.out.println("final max len : "+max);
    }

    private static int maxSubLength(String str) {
        int maxLength=0;
        ConcurrentHashMap<Character, Integer> set = new ConcurrentHashMap<>();
        int right=0;
        int left=0;
        while (right<str.length()) {
            //System.out.println("character at right : "+str.charAt(right));
            char charAt = str.charAt(right);
            if(!set.containsKey(charAt)) {
                //System.out.println("right : "+right);
                //System.out.println("left : "+left);
                set.put(charAt, right);
                if(maxLength<(right-left)+1){
                    maxLength = (right-left)+1;
                }
                right++;
            } else {
                //System.out.println("right : "+right);
                //System.out.println("left : "+left);
                //System.out.println("Char found : "+str.charAt(right));
                //System.out.println("last occurance at index : "+ set.get(str.charAt(right)));
                left=set.get(charAt)+1;
                int finalLeft = left;
                set.entrySet()
                                .forEach(entry -> {
                                    if(entry.getValue()< finalLeft){
                                        set.remove(entry.getKey());
                                    }
                                });
                set.put(charAt, right);
                if(maxLength<(right-left)+1){
                    maxLength = (right-left)+1;
                }
                right++;

                //System.out.println("updated right : "+right);
                //System.out.println("updated left : "+left);
            }

            //System.out.println("maxLength : "+maxLength);
            //System.out.println("non-repeat-subString : "+set);
            //System.out.println("----------------------");
        }
        return maxLength;
    }
}
