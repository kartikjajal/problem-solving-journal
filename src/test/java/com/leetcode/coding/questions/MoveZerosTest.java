package com.leetcode.coding.questions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
public class MoveZerosTest {

    private MoveZeroes uut = new MoveZeroes();

    @ParameterizedTest
    @MethodSource("getTestData")
    void test_moveZeroes(int[] nums, int[] expected) {
        uut.moveZeroes(nums);
        Assertions.assertThat(nums).isEqualTo(expected);
    }

    private static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int[] {0,1,0,3,12}, new int[] {1,3,12,0,0}),
                Arguments.of(new int[] {0}, new int[] {0})
        );
    }
}