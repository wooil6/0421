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
//class T_isContainTest {
//    T_isContain test = spy(T_isContain.class);
//    HashMap<String, Integer> hashMap = new HashMap<String, Integer>(){{
//        put("김코딩", 20);
//        put("박해커", 25);
//        put("최자바", 30);
//        put("김러키", 3);
//        put("바닐라", 2);
//        put("김라떼", 3);
//    }};
//    private static String readLineByLineJava8(String filePath) {  // .java code to String
//        File file = new File(filePath);
//        String absolutePath = file.getAbsolutePath(); //절대 경로 찾기
//
//        StringBuilder contentBuilder = new StringBuilder();
//
//        try (Stream<String> stream = Files.lines(Paths.get(absolutePath), StandardCharsets.UTF_8)) {
//            stream.forEach(s -> contentBuilder.append(s).append("\n"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return contentBuilder.toString();
//    }
//
//    @Test
//    @DisplayName("반복문(for, while)을 사용하지 말아야 합니다")
//    public void 반복문_사용_체크() {
//        String path = "src/main/java/com/choongang/T_isContain.java"; // 파일 위치
//        String text = readLineByLineJava8(path);  //코드를 모두 java 파일로 변환
//        assertThat(StringUtils.countMatches(text, "for")).isZero();
//        assertThat(StringUtils.countMatches(text, "while")).isZero();
//    }
//
//    @Test
//    @DisplayName("정확한 boolean값을 리턴해야 합니다")
//    public void testFoo() {
//        assertThat(test.isContain(hashMap, "code")).isFalse();
//    }
//
//    @Test
//    @DisplayName("정확한 boolean값을 리턴해야 합니다")
//    public void testFoo2() {
//        assertThat(test.isContain(hashMap, "states")).isFalse();
//    }
//
//    @Test
//    @DisplayName("정확한 boolean값을 리턴해야 합니다")
//    public void testFoo3() {
//        assertThat(test.isContain(hashMap, "김러키")).isTrue();
//    }
//
//    @Test
//    @DisplayName("정확한 boolean값을 리턴해야 합니다")
//    public void testFoo4() {
//        assertThat(test.isContain(hashMap, "바닐라")).isTrue();
//    }
//}