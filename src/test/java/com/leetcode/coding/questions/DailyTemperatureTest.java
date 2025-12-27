package com.leetcode.coding.questions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
public class DailyTemperatureTest {

    private DailyTemperature uut = new DailyTemperature();

    @ParameterizedTest
    @MethodSource("getTestData")
    void test_dailyTemperatures(int []nums, int []expected) {
        int []actual = uut.dailyTemperatures(nums);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int[] {73,74,75,71,69,72,76,73}, new int[] {1,1,4,2,1,1,0,0}),
                Arguments.of(new int[] {30,40,50,60}, new int[] {1,1,1,0}),
                Arguments.of(new int[] {30,60,90}, new int[] {1,1,0})
        );
    }
}
