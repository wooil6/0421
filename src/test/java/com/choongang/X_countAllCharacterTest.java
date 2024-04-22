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
//class X_countAllCharacterTest {
//    X_countAllCharacter solution;
//
//    @BeforeEach
//    void setUp() {
//        solution = new X_countAllCharacter();
//    }
//
//    @Test
//    @DisplayName("빈 문자열을 입력받은 경우, null을 리턴해야 합니다.")
//    public void testFoo() {
//        assertThat(solution.countAllCharacter("")).isNull();
//    }
//
//    @Test
//    @DisplayName("\"banana\"를 입력받은 경우, {b=1, a=3, n=2}와 같은 HashMap을 리턴해야 합니다")
//    public void testFoo2() {
//        HashMap<Character, Integer> map = new HashMap<Character, Integer>(){{
//            put('b', 1);
//            put('a', 3);
//            put('n', 2);
//        }};
//        assertThat(solution.countAllCharacter("banana")).isEqualTo(map);
//    }
//
//    @Test
//    @DisplayName("\"codestates\"를 입력받은 경우, {'a'=1, 'c'=1, 'd'=1, 'e'=2, 'o'=1, 's'=2, 't'=2}와 같은 HashMap을 리턴해야 합니다")
//    public void testFoo3() {
//        HashMap<Character, Integer> map = new HashMap<Character, Integer>(){{
//            put('a', 1);
//            put('c', 1);
//            put('d', 1);
//            put('e', 2);
//            put('o', 1);
//            put('s', 2);
//            put('t', 2);
//        }};
//        assertThat(solution.countAllCharacter("codestates")).isEqualTo(map);
//    }
//
//    @Test
//    @DisplayName("\"kimcoding\"를 입력받은 경우, {'c'=1, 'd'=1, 'g'=1, 'i'=2, 'k'=1, 'm'=1, 'n'=1, 'o'=1}와 같은 HashMap을 리턴해야 합니다")
//    public void testFoo4() {
//        HashMap<Character, Integer> map = new HashMap<Character, Integer>(){{
//            put('c', 1);
//            put('d', 1);
//            put('g', 1);
//            put('i', 2);
//            put('k', 1);
//            put('m', 1);
//            put('n', 1);
//            put('o', 1);
//        }};
//        assertThat(solution.countAllCharacter("kimcoding")).isEqualTo(map);
//    }
//}