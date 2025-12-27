package com.leetcode.coding.questions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PalindromicStringTest {

    private final PalindromicString uut = new PalindromicString();

    @ParameterizedTest
    @MethodSource("getTestData")
    void test(final String input, final String expected) {
        Assertions.assertThat(uut.longestPalindrome(input)).isEqualTo(expected);
    }


    private static Stream<Arguments> getTestData() {
        return Stream.of(
               Arguments.of("babad", "bab"),
                Arguments.of("cbbd", "bb"),
                Arguments.of("abacdfgdcaba", "abacdfgdcaba"),
                Arguments.of("abb", "bb"),
                Arguments.of("abba", "abba"),
                Arguments.of("aba", "aba")


        );
    }
}