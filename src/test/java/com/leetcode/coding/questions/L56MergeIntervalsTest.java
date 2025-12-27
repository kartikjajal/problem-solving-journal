package com.leetcode.coding.questions;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
public class L56MergeIntervalsTest {

    private L56_MergeIntervals uut = new L56_MergeIntervals();

    @ParameterizedTest
    @MethodSource("getTestData")
    void test_intervalIntersection(int [][]input, int [][] expected) {
        int[][] actual = uut.overlappingIntervals(input);
        for(int i=0; i<expected.length; i++) {
            for(int j=0; j<expected[i].length; j++) {
                assert expected[i][j] == actual[i][j];
            }
        }
    }
    private static Stream<Arguments> getTestData() {
        return Stream.of(
            Arguments.of(new int[][]{{1,3},{2,6},{8,10},{15,18}}, new int[][]{{1,6},{8,10},{15,18}}),
            Arguments.of(new int[][]{{1,4},{4,5}}, new int[][]{{1,5}}),
            Arguments.of(new int[][]{{1,3},{2,4},{5,7}}, new int[][]{{1,4},{5,7}}),
            Arguments.of(new int[][]{{1,4},{0,2},{3,5}}, new int[][]{{0,5}}),
            Arguments.of(new int[][]{{1,3},{4,6},{7,9}}, new int[][]{{1,3},{4,6},{7,9}}),
            Arguments.of(new int[][]{{1,2},{3,4},{5,6}}, new int[][]{{1,2},{3,4},{5,6}}),
            Arguments.of(new int[][]{{1,10},{2,5},{6,8},{9,12}}, new int[][]{{1,12}}),
            Arguments.of(new int[][]{{1,3},{2,6},{1,4},{8,10},{15,18}}, new int[][]{{1,6},{8,10},{15,18}}),
            Arguments.of(new int[][]{{8,10},{2,6},{1,3},{15,18},{1,4}}, new int[][]{{1,6},{8,10},{15,18}}),
            Arguments.of(new int [][] {{2,3},{5,5},{2,2},{3,4},{3,4}}, new int[][]{{2,4},{5,5}}),
            Arguments.of(new int[][]{{2, 3}, {2, 2}, {3, 3}, {1, 3}, {5, 7}, {2, 2}, {4, 6}}, new int[][]{{1,3},{4,7}})
        );
    }

}
