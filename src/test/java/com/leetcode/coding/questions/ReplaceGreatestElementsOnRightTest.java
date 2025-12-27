package com.leetcode.coding.questions;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
public class ReplaceGreatestElementsOnRightTest {

    private ReplaceGreatestElementsOnRight uut = new ReplaceGreatestElementsOnRight();

    @ParameterizedTest
    @MethodSource("getTestData")
    void test_replaceElements(int []nums, int []expected) {
        int []actual = uut.replaceElements(nums);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> getTestData(){
        return Stream.of(
                Arguments.of(new int[] {17,18,5,4,6,1}, new int[] {18,6,6,6,1,-1}),
                Arguments.of(new int[] {400}, new int[] {-1})
        );
    }
}
