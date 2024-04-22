package com.choongang;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class A_makeArrayListTest {

    A_makeArrayList solution;

    @BeforeEach
    void setUp() {
        solution = new A_makeArrayList();
    }

    @Test
    @DisplayName("정확한 List를 리턴해야 합니다")
    public void testFoo() {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        assertThat(solution.makeArrayList()).isEqualTo(input);
    }
}