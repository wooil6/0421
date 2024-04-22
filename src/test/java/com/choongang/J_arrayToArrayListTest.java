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

class J_arrayToArrayListTest {
    J_arrayToArrayList solution;

    @BeforeEach
    void setUp() {
        solution = new J_arrayToArrayList();
    }

    @Test
    @DisplayName("빈 배열을 입력받은 경우 null을 리턴해야 합니다.")
    public void testFoo() {
        assertThat(solution.arrayToArrayList(new String[]{})).isNull();
    }

    @Test
    @DisplayName("입력받은 배열과 동일한 요소를 가진 List를 리턴해야 합니다")
    public void testFoo2() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("코드", "스프링", "부트캠프"));
        assertThat(solution.arrayToArrayList(new String[]{"코드", "스프링", "부트캠프"})).isEqualTo(list);
    }

    @Test
    @DisplayName("입력받은 배열과 동일한 요소를 가진 List를 리턴해야 합니다")
    public void testFoo3() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("java", "spring", "tomcat"));
        assertThat(solution.arrayToArrayList(new String[]{"java", "spring", "tomcat"})).isEqualTo(list);
    }
}