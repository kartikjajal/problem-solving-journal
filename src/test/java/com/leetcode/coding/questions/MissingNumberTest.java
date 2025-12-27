package com.leetcode.coding.questions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
public class MissingNumberTest {

    private MissingNumber uut = new MissingNumber();

    @ParameterizedTest
    @MethodSource("getTestData")
    void test_missingNumber(int []nums, int expected) {
        int actual = uut.missingNumber(nums);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int[] {3,0,1}, 2),
                Arguments.of(new int[] {0,1}, 2),
                Arguments.of(new int[] {1}, 0),
                Arguments.of(new int[] {9,6,4,2,3,5,7,0,1}, 8)
        );
    }
}
