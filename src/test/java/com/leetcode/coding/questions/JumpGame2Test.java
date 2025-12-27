package com.leetcode.coding.questions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class JumpGame2Test {
    private final JumpGame2 uut = new JumpGame2();

    @ParameterizedTest
    @MethodSource("getTestData")
    void test_jump(int []nums, int expected) {
        Assertions.assertThat(uut.jump(nums)).isEqualTo(expected);
    }

    private static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int[]{2,3,1,1,4}, 2),
                Arguments.of(new int[]{2,3,0,1,4}, 2),
                Arguments.of(new int[]{1,2}, 1),
                Arguments.of(new int[]{0}, 0),
                Arguments.of(new int[]{1}, 0),
                Arguments.of(new int[]{1,1,1,2,1}, 4),
                Arguments.of(new int[]{7,0,9,6,9,6,1,7,9,0,1,2,9,0,3}, 2)
        );
    }
}
