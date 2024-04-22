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
//class V_isMemberTest {
//    V_isMember solution;
//
//    HashMap<String, String> member = new HashMap<String, String>(){{
//        put("kimcoding", "1234");
//        put("parkhacker", "qwer");
//        put("code", "states");
//        put("lucky", "q1w2e3");
//    }};
//
//    private static String readLineByLineJava8(String filePath) {	// .java code to String
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
//    @BeforeEach
//    void setUp() {
//        solution = new V_isMember();
//    }
//
//    @Test
//    @DisplayName("존재하지 않는 username을 입력한 경우 false를 리턴합니다")
//    public void testFoo() {
//        assertThat(solution.isMember(member, "latte", "cat")).isFalse();
//    }
//
//    @Test
//    @DisplayName("username과 password가 일치하지 않는 경우 false를 리턴합니다")
//    public void testFoo2() {
//        assertThat(solution.isMember(member, "lucky", "q1w2")).isFalse();
//    }
//
//    @Test
//    @DisplayName("username과 password가 일치하는 경우 true를 리턴합니다")
//    public void testFoo3() {
//        assertThat(solution.isMember(member, "code", "states")).isTrue();
//    }
//
//    @Test
//    @DisplayName("username과 password가 일치하는 경우 true를 리턴합니다")
//    public void testFoo4() {
//        assertThat(solution.isMember(member, "parkhacker", "qwer")).isTrue();
//    }
//
//    @Test
//    @DisplayName("containsValue()를 사용하지 말아야 합니다")
//    public void 반복문_사용_체크() {
//        String path = "src/main/java/com/choongang/V_isMember.java"; // 파일 위치
//        String text = readLineByLineJava8(path);  //코드를 모두 java 파일로 변환
//        assertThat(StringUtils.countMatches(text, "containsValue(")).isZero();
//    }
//}