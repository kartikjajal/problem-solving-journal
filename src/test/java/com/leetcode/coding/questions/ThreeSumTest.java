package com.leetcode.coding.questions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
public class ThreeSumTest {
    private ThreeSum uut = new ThreeSum();

    @ParameterizedTest
    @MethodSource("getTestData")
    void test_threeSum(int []nums, List<List<Integer>> expected) {
        List<List<Integer>> actual = uut.threeSum(nums);
        Assertions.assertThat(actual)
                .usingRecursiveComparison()
                .ignoringCollectionOrder()
                .isEqualTo(expected);
    }

    private static Stream<Arguments> getTestData() {
        return Stream.of(
                /*Arguments.of(new int[] {-1,0,1,2,-1,-4}, List.of(List.of(-1,-1,2), List.of(-1,0,1))),
                Arguments.of(new int[] {0,1,1}, List.of()),
                Arguments.of(new int[] {0,0,0}, List.of(List.of(0,0,0)))*/
        );
    }
}
