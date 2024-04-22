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
//class U_getElementOfListEntryTest {
//    U_getElementOfListEntry solution;
//
//    HashMap<String, List<String>> hashMap = new HashMap<String, List<String>>(){{
//        put("apple", Arrays.asList("apple", "red"));
//        put("banana", Arrays.asList("delicious"));
//        put("people", Arrays.asList("kim", "Lee", "cho", "va"));
//        put("cat", Arrays.asList());
//    }};
//
//    @BeforeEach
//    void setUp() {
//        solution = new U_getElementOfListEntry();
//    }
//
//    @Test
//    @DisplayName("HashMap의 요소인 List에서 정확한 값을 리턴해야 합니다")
//    public void testFoo() {
//        assertThat(solution.getElementOfListEntry(hashMap, "apple", 0)).isEqualTo("apple");
//    }
//
//    @Test
//    @DisplayName("HashMap의 요소인 List에서 정확한 값을 리턴해야 합니다")
//    public void testFoo2() {
//        assertThat(solution.getElementOfListEntry(hashMap, "banana", 0)).isEqualTo("delicious");
//    }
//
//    @Test
//    @DisplayName("HashMap의 요소인 List에서 정확한 값을 리턴해야 합니다")
//    public void testFoo3() {
//        assertThat(solution.getElementOfListEntry(hashMap, "people", 0)).isEqualTo("kim");
//    }
//
//    @Test
//    @DisplayName("존재하지 않는 key를 입력한 경우 null을 리턴해야 합니다")
//    public void testFoo4() {
//        assertThat(solution.getElementOfListEntry(hashMap, "dog", 0)).isNull();
//    }
//
//    @Test
//    @DisplayName("크기를 벗어난 index를 입력한 경우 null을 리턴해야 합니다")
//    public void testFoo5() {
//        assertThat(solution.getElementOfListEntry(hashMap, "people", 9)).isNull();
//    }
//}