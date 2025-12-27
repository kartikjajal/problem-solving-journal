package com.leetcode.coding.questions;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
public class KthLargestElementTest {
    private final KthLargestElement uut = new KthLargestElement();

    @ParameterizedTest
    @MethodSource("getTestData")
    void test_findKthLargest(int []nums, int k, int expected) {

    }

    private static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int [] {3,2,1,5,6,4}, 2, 5),
                Arguments.of(new int [] {3,2,3,1,2,4,5,5,6}, 4, 4)
        );
    }
}
