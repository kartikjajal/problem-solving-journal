package com.leetcode.coding.questions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
public class MedianSortedArrayTest {

    private MedianSortedArray uut = new MedianSortedArray();

    @ParameterizedTest
    @MethodSource("getTestData")
    void test_findMedianSortedArrays(int []nums1, int []nums2, double expected) {
        double actual = uut.findMedianSortedArrays(nums1,nums2);

        Assertions.assertThat(actual).isEqualTo(expected);
    }
    private static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int[] {1,3}, new int[] {2}, 2),
                Arguments.of(new int[] {2,2,4,4}, new int[] {2,2,2,4,4}, 2),
                Arguments.of(new int[] {1,2}, new int[] {3,4}, 2.5)

        );
    }
}
