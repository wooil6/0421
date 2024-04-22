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
//class S_addFullNameEntryTest {
//    S_addFullNameEntry test = spy(S_addFullNameEntry.class);
//
//
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
//        String path = "src/main/java/com/choongang/S_addFullNameEntry.java"; // 파일 위치
//        String text = readLineByLineJava8(path);  //코드를 모두 java 파일로 변환
//        assertThat(StringUtils.countMatches(text, "for")).isZero();
//        assertThat(StringUtils.countMatches(text, "while")).isZero();
//    }
//
//    @Test
//    @DisplayName("성과 이름이 합쳐진 값이 추가된 HashMap을 리턴해야 합니다")
//    public void testFoo() {
//        HashMap<String, String> map = new HashMap<String, String>(){{
//            put("firstName", "kim");
//            put("lastName", "coding");
//        }};
//        HashMap<String, String> output = new HashMap<String, String>(){{
//            put("firstName", "kim");
//            put("lastName", "coding");
//            put("fullName", "kimcoding");
//        }};
//        assertThat(test.addFullNameEntry(map)).isEqualTo(output);
//    }
//
//    @Test
//    @DisplayName("성과 이름이 합쳐진 값이 추가된 HashMap을 리턴해야 합니다")
//    public void testFoo2() {
//        HashMap<String, String> map = new HashMap<String, String>(){{
//            put("firstName", "code");
//            put("lastName", "states");
//        }};
//        HashMap<String, String> output = new HashMap<String, String>(){{
//            put("firstName", "code");
//            put("lastName", "states");
//            put("fullName", "codestates");
//        }};
//        assertThat(test.addFullNameEntry(map)).isEqualTo(output);
//    }
//
//    @Test
//    @DisplayName("성과 이름이 합쳐진 값이 추가된 HashMap을 리턴해야 합니다")
//    public void testFoo3() {
//        HashMap<String, String> map = new HashMap<String, String>(){{
//            put("firstName", "kim");
//            put("lastName", "latte");
//        }};
//        HashMap<String, String> output = new HashMap<String, String>(){{
//            put("firstName", "kim");
//            put("lastName", "latte");
//            put("fullName", "kimlatte");
//        }};
//        assertThat(test.addFullNameEntry(map)).isEqualTo(output);
//    }
//}