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
import java.util.HashMap;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import static org.mockito.Mockito.mockingDetails;
import static org.mockito.Mockito.spy;

class M_getValueTest {
    M_getValue solution;

    HashMap<String, Integer> map = new HashMap<String, Integer>(){{
        put("A", 1);
        put("B", 2);
        put("C", 3);
        put("head", 10);
        put("tail", 19);
        put("number", 99);
    }};

    @BeforeEach
    void setUp() {
        solution = new M_getValue();

    }

    @Test
    @DisplayName("입력받은 key에 해당하는 값을 리턴해야 합니다")
    public void testFoo() {
        assertThat(solution.getValue(map, "A")).isEqualTo(1);
    }

    @Test
    @DisplayName("입력받은 key에 해당하는 값을 리턴해야 합니다")
    public void testFoo2() {
        assertThat(solution.getValue(map, "B")).isEqualTo(2);
    }

    @Test
    @DisplayName("입력받은 key에 해당하는 값을 리턴해야 합니다")
    public void testFoo3() {
        assertThat(solution.getValue(map, "tail")).isEqualTo(19);
    }

    @Test
    @DisplayName("입력받은 key에 해당하는 값을 리턴해야 합니다")
    public void testFoo4() {
        assertThat(solution.getValue(map, "number")).isEqualTo(99);
    }
}