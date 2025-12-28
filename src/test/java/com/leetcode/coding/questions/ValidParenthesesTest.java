package com.leetcode.coding.questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
public class ValidParenthesesTest {

    private ValidParentheses uut = new ValidParentheses();

    @ParameterizedTest
    @MethodSource("getTestData")
    void test_validParentheses(String s, boolean expected) {
        boolean actual = uut.isValid(s);
        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> getTestData() {
        return Stream.of(Arguments.of(
                "){",false
        ));
    }
}
