package com.leetcode.coding.questions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
public class JumpGameTest {

    private JumpGame uut = new JumpGame();

    @ParameterizedTest
    @MethodSource("getTestData")
    void test_canJump(int []nums, boolean expected) {
        boolean actual = uut.canJump(nums);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int[] {2,3,1,1,4}, true),
                Arguments.of(new int[] {3,2,1,0,4}, false),
                Arguments.of(new int[] {1}, true),
                Arguments.of(new int[] {0}, true),
                Arguments.of(new int[] {1,2,3}, true)

        );
    }
}
