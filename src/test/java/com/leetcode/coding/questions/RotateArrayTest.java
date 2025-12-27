package com.leetcode.coding.questions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
public class RotateArrayTest {

    private RotateArray uut = new RotateArray();

    @ParameterizedTest
    @MethodSource("getTestData")
    void test_rotate(int nums[], int k, int []expected) {
         uut.rotate(nums, k);
        Assertions.assertThat(nums).isEqualTo(expected);
    }

    private static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int[] {1,2,3,4,5,6,7}, 3, new int[] {5,6,7,1,2,3,4}),
                Arguments.of(new int[] {-1,-100,3,99}, 2, new int[] {3,99,-1,-100})
        );
    }
}
