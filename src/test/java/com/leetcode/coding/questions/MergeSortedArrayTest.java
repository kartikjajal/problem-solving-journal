package com.leetcode.coding.questions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
public class MergeSortedArrayTest {

    private MergeSortedArray uut = new MergeSortedArray();

    @ParameterizedTest
    @MethodSource("getTestData")
    void test_merge(int nums1[], int m, int num2[], int n, int[] expected) {
         uut.merge(nums1,m, num2,n);

        Assertions.assertThat(nums1).isEqualTo(expected);
    }

    private static Stream<Arguments> getTestData(){
        return Stream.of(
                Arguments.of(
                new int[] {1,2,3,0,0,0},
                3,
                new int[] {2,5,6},
                3,
                new int[] {1,2,2,3,5,6}),
                Arguments.of(
                        new int[]  {4,5,6,0,0,0},
                        3,
                        new int[] {1,2,3},
                        3,
                        new int[] {1,2,3,4,5,6})
        );
    }
}
