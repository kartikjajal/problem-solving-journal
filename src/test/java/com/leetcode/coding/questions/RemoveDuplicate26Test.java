package com.leetcode.coding.questions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
public class RemoveDuplicate26Test {

    private RemoveDuplicate26 uut = new RemoveDuplicate26();

    @ParameterizedTest
    @MethodSource("getTestData")
    void test_removeElement(int []nums, int expected) {
        int actual = uut.removeElement(nums);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> getTestData() {
        return Stream.of(
                Arguments.of(new int[]{1,1,2}, 2),
                Arguments.of(new int[]{0,0,1,1,1,2,2,3,3,4}, 5)
        );
    }
}
