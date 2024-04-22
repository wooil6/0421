package com.choongang;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import static org.mockito.Mockito.mockingDetails;
import static org.mockito.Mockito.spy;

class I_removeFromBackOfNewTest {
    I_removeFromBackOfNew solution;

    @BeforeEach
    void setUp() {
        solution = new I_removeFromBackOfNew();
    }

    @Test
    @DisplayName("새로운 ArrayList를 만들어서 리턴해야 합니다.")
    public void testFoo() {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list_2 = solution.removeFromBackOfNew(list);
        assertThat(list == list_2).isFalse();
    }

    @Test
    @DisplayName("빈 ArrayList를 입력받은 경우 null을 리턴해야 합니다.")
    public void test() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        assertThat(solution.removeFromBackOfNew(list)).isNull();
    }

    @Test
    @DisplayName("마지막 요소를 제거한 ArrayList를 리턴해야 합니다.")
    public void test_1() {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list_2 = new ArrayList<Integer>(Arrays.asList(1, 2));
        assertThat(solution.removeFromBackOfNew(list)).isEqualTo(list_2);
    }
}