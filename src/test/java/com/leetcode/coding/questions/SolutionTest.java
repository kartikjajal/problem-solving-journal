package com.leetcode.coding.questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SolutionTest {
    private final Solution uut = new Solution();

    @ParameterizedTest
    @MethodSource("getTestData")
    void test_isBalancedArray(int nums[], boolean expected) {

        boolean actual = uut.isBalancedArray(nums);

        Assertions.assertEquals(expected, actual);

    }

    private static Stream<Arguments> getTestData() {
        return Stream.of(Arguments.of(-2, 3, 2, -3));
    }
}
