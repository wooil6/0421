package com.choongang;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class B_getNthElementTest {
    B_getNthElement solution;

    @BeforeEach
    void setUp() {
        solution = new B_getNthElement();
    }

    @Test
    @DisplayName("빈 List가 입력되었을때, null을 리턴해야 합니다")
    public void testFoo() {
        ArrayList<Integer> input = new ArrayList<Integer>();
        assertThat(solution.getNthElement(input, 0)).isEqualTo(null);
    }

    @Test
    @DisplayName("[0, 1, 2, 3, 4, 5, 6, 7], 3을 입력받았을 경우 3를 리턴해야 합니다.")
    public void testFoo2() {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7));
        assertThat(solution.getNthElement(input, 3)).isEqualTo(3);
    }

    @Test
    @DisplayName("[0, 1, 2, 3, 4, 5, 6, 7], 2을 입력받았을 경우 2를 리턴해야 합니다.")
    public void testFoo3() {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7));
        assertThat(solution.getNthElement(input, 2)).isEqualTo(2);
    }

    @Test
    @DisplayName("[9, 5, 3, 1, 2], 3을 입력받았을 경우 1를 리턴해야 합니다.")
    public void testFoo4() {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(9, 5, 3, 1, 2));
        assertThat(solution.getNthElement(input, 3)).isEqualTo(1);
    }
}