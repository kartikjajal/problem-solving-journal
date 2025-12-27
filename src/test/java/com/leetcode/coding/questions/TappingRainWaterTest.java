package com.leetcode.coding.questions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
public class TappingRainWaterTest {

    private TappingRainWater uut = new TappingRainWater();

    @ParameterizedTest
    @MethodSource("getTestData")
    void test_trap(int []heights, int expected) {
        int actual = uut.trap(heights);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int [] {2,1,0,1,3,2}, 4)
        );
    }
}
