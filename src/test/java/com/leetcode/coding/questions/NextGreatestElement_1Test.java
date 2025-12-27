package com.leetcode.coding.questions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
public class NextGreatestElement_1Test {

    private NextGreatestElement_1 uut = new NextGreatestElement_1();

    @ParameterizedTest
    @MethodSource("getTestData")
    void test_nextGreaterElement(int []nums1, int []nums2, int []expected) {
        int []actual = uut.nextGreaterElement(nums1, nums2);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int[] {4,1,2}, new int[] {1,3,4,2}, new int[] {-1,3,-1}),
                Arguments.of(new int[] {2,4}, new int[] {1,2,3,4}, new int[] {3,-1})
        );
    }
}
