package com.leetcode.coding.questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
public class MaxSubArraySumTest {

    private MaxSubArraySum uut = new MaxSubArraySum();

    @ParameterizedTest
    @MethodSource("getTestData")
    void test_maxSubArraySum(int []nums, int expected) {
        int actual = uut.maxSubArray(nums);
        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> getTestData() {

        return Stream.of(
                Arguments.of(new int[] {-2,1,-3,4,-1,2,1,-5,4}, 6),
                Arguments.of(new int[] {1}, 1),
                Arguments.of(new int[] {-1}, -1),
                Arguments.of(new int[] {-2,-1,-3}, -1),
                Arguments.of(new int[] {5,4,-1,7,8}, 23)
        );
    }
}
