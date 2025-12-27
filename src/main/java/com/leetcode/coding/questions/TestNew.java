package com.leetcode.coding.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestNew {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Map<String, String> cityMap = new HashMap<>();
        cityMap.put("Alice", "Bangalore");
        cityMap.put("Bob", "Pune");
        cityMap.put("Carol", "Bangalore");
        cityMap.put("David", "Chennai");
        cityMap.put("Eve", "Hyderabad");
        cityMap.put("Frank", "Delhi");
        Map<String, List<String>> resultMap = cityMap.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())));

        System.out.println(resultMap);
    }
}
