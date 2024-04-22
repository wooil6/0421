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
import java.util.*;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import static org.mockito.Mockito.mockingDetails;
import static org.mockito.Mockito.spy;

class R_addEvenValuesTest {
    R_addEvenValues solution;

    @BeforeEach
    void setUp() {
        solution = new R_addEvenValues();
    }

    @Test
    @DisplayName("{'a'=1, 'b'=4, 'c'=6, 'd'=9}를 요소로 가지는 HashMap을 입력받은 경우 10을 리턴합니다")
    public void testFoo() {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>(){{
            put('a', 1);
            put('b', 4);
            put('c', 6);
            put('d', 9);
        }};
        assertThat(solution.addEvenValues(map)).isEqualTo(10);
    }

    @Test
    @DisplayName("{'a'=2, 'b'=4, 'c'=6, 'd'=8}를 요소로 가지는 HashMap을 입력받은 경우 20을 리턴합니다")
    public void testFoo2() {
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>(){{
            put('a', 2);
            put('b', 4);
            put('c', 6);
            put('d', 8);
        }};
        assertThat(solution.addEvenValues(hashMap)).isEqualTo(20);
    }

    @Test
    @DisplayName("{'a'=0, 'b'=0, 'c'=0, 'd'=0}를 요소로 가지는 HashMap을 입력받은 경우 0을 리턴합니다")
    public void testFoo3() {
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>(){{
            put('a', 0);
            put('b', 0);
            put('c', 0);
            put('d', 0);
        }};
        assertThat(solution.addEvenValues(hashMap)).isEqualTo(0);
    }
}