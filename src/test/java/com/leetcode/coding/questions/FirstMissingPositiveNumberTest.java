package com.leetcode.coding.questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
public class FirstMissingPositiveNumberTest {
    private FirstMissingPositiveNumber uut = new FirstMissingPositiveNumber();

    @ParameterizedTest
    @MethodSource("getTestData")
    void test_firstMissingPositive(int []nums, int expected) {
        int actual = uut.firstMissingPositive(nums);
        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int [] {1,2,0}, 3),
                Arguments.of(new int [] {3,4,-1,1}, 2),
                Arguments.of(new int [] {7,8,9,11,12}, 1)
        );
    }
}
