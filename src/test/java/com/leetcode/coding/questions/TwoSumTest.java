package com.leetcode.coding.questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
public class TwoSumTest {

    private final TwoSum uut = new TwoSum();

    @ParameterizedTest
    @MethodSource("getTestData")
    void test_twoSum(int []nums, int target, int []expected) {
        int [] actual = uut.twoSum(nums, target);
        Assertions.assertArrayEquals(expected, actual);
    }

    private static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int[] {2,7,11,15}, 9, new int[] {0,1})
        );
    }
}
