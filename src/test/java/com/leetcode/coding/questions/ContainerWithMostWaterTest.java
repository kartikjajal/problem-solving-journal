package com.leetcode.coding.questions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
public class ContainerWithMostWaterTest {

    private ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

    @ParameterizedTest
    @MethodSource("getTestData")
    void maxArea_test(int []nums, int expected) {
        int actual = containerWithMostWater.maxArea(nums);
        Assertions.assertThat(actual).isEqualTo(expected);
    }


    private static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int[]{1,8,6,2,5,4,8,3,7}, 49),
                Arguments.of(new int[]{1,1}, 1),
                Arguments.of(new int[]{4,3,2,1,4}, 16),
                Arguments.of(new int[]{1,2,1}, 2)
        );
    }
}
