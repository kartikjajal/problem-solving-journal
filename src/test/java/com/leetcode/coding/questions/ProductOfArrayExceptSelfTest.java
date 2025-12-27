package com.leetcode.coding.questions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ProductOfArrayExceptSelfTest {

    private ProductOfArrayExceptSelf uut = new ProductOfArrayExceptSelf();

    @ParameterizedTest
    @MethodSource("getTestData")
    void test(final int [] input, final int [] expected) {
        Assertions.assertThat(uut.productExceptSelf(input)).isEqualTo(expected);
    }
    private static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int []{1,2,3,4}, new int [] {24,12,8,6}),
                Arguments.of(new int []{-1,1,0,-3,3}, new int [] {0,0,9,0,0})

        );
    }
}
