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

class O_removeEntryTest {
    O_removeEntry solution;

    HashMap<String, Integer> map = new HashMap<String, Integer>(){{
        put("a", 1);
        put("b", 2);
        put("c", 3);
    }};

    @BeforeEach
    void setUp() {
        solution = new O_removeEntry();
    }

    @Test
    @DisplayName("입력받은 key와 연결되어 있는 value를 삭제해야 합니다.")
    public void testFoo() {
        solution.removeEntry(map, "a");
        HashMap<String, Integer> output = new HashMap<String, Integer>(){{
            put("b", 2);
            put("c", 3);
        }};
        assertThat(map).isEqualTo(output);
    }

    @Test
    @DisplayName("입력받은 key와 연결되어 있는 value를 삭제해야 합니다.")
    public void testFoo2() {
        solution.removeEntry(map, "b");
        HashMap<String, Integer> output = new HashMap<String, Integer>(){{
            put("a", 1);
            put("c", 3);
        }};
        assertThat(map).isEqualTo(output);
    }

    @Test
    @DisplayName("입력받은 key와 연결되어 있는 value를 삭제해야 합니다.")
    public void testFoo3() {
        solution.removeEntry(map, "c");
        HashMap<String, Integer> output = new HashMap<String, Integer>(){{
            put("a", 1);
            put("b", 2);
        }};

        assertThat(map).isEqualTo(output);
    }
}