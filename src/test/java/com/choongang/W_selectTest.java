//package com.choongang;
//
//import org.apache.commons.lang3.StringUtils;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.*;
//import java.util.stream.Stream;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//
//import static org.mockito.Mockito.mockingDetails;
//import static org.mockito.Mockito.spy;
//
//class W_selectTest {
//    W_select solution;
//    HashMap<String, Integer> hashMap = new HashMap<String, Integer>(){{
//        put("a", 1);
//        put("b", 2);
//        put("c", 3);
//        put("d", 4);
//        put("e", 5);
//    }};
//    @BeforeEach
//    void setUp() {
//        solution = new W_select();
//    }
//
//    @Test
//    @DisplayName("배열의 요소와 일치하는 요소만을 포함하는 HashMap을 리턴해야 합니다")
//    public void testFoo() {
//        String[] arr = new String[]{"a", "b", "c", "d", "e"};
//        HashMap<String, Integer> output = new HashMap<String, Integer>(){{
//            put("a", 1);
//            put("b", 2);
//            put("c", 3);
//            put("d", 4);
//            put("e", 5);
//        }};
//        assertThat(solution.select(arr, hashMap)).isEqualTo(output);
//    }
//
//    @Test
//    @DisplayName("배열의 요소와 일치하는 요소만을 포함하는 HashMap을 리턴해야 합니다")
//    public void testFoo2() {
//        String[] arr = new String[]{"a", "b", "c", "d", "f", "z"};
//        HashMap<String, Integer> output = new HashMap<String, Integer>(){{
//            put("a", 1);
//            put("b", 2);
//            put("c", 3);
//            put("d", 4);
//        }};
//        assertThat(solution.select(arr, hashMap)).isEqualTo(output);
//    }
//
//    @Test
//    @DisplayName("배열의 요소와 일치하는 요소만을 포함하는 HashMap을 리턴해야 합니다")
//    public void testFoo3() {
//        String[] arr = new String[]{"b"};
//        HashMap<String, Integer> output = new HashMap<String, Integer>(){{
//            put("b", 2);
//        }};
//        assertThat(solution.select(arr, hashMap)).isEqualTo(output);
//    }
//
//    @Test
//    @DisplayName("배열의 요소와 일치하는 요소만을 포함하는 HashMap을 리턴해야 합니다")
//    public void testFoo4() {
//        String[] arr = new String[]{"a", "e", "code", "states"};
//        HashMap<String, Integer> output = new HashMap<String, Integer>(){{
//            put("a", 1);
//            put("e", 5);
//        }};
//        assertThat(solution.select(arr, hashMap)).isEqualTo(output);
//    }
//}