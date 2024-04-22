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

class D_addLastTest {
    D_addLast solution = spy(D_addLast.class);

    private static String readLineByLineJava8(String filePath) {	// .java code to String
        File file = new File(filePath);
        String absolutePath = file.getAbsolutePath(); //절대 경로 찾기

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(absolutePath), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }

    @Test
    @DisplayName("반복문(for, while) 사용은 금지됩니다")
    public void 반복문_for_while_사용은_금지됩니다() {
        String path = "src/main/java/com/choongang/D_addLast.java"; // 파일 위치
        String text = readLineByLineJava8(path);  //코드를 모두 java 파일로 변환
        assertThat(StringUtils.countMatches(text, "for")).isZero();
        assertThat(StringUtils.countMatches(text, "while")).isZero();
    }

    @Test
    @DisplayName("새롭게 추가한 String타입의 값이 포함된 ArrayList를 리턴해야 합니다")
    public void testFoo() {
        ArrayList<String> input = new ArrayList<String>(Arrays.asList("a", "b"));
        ArrayList<String> output = new ArrayList<String>(Arrays.asList("a", "b", "c"));
        assertThat(solution.addLast(input, "c")).isEqualTo(output);
    }

    @Test
    @DisplayName("새롭게 추가한 String타입의 값이 포함된 ArrayList를 리턴해야 합니다")
    public void testFoo2() {
        ArrayList<String> input = new ArrayList<String>(Arrays.asList("a", "b" , "c", "d"));
        ArrayList<String> output = new ArrayList<String>(Arrays.asList("a", "b", "c", "d", "apple"));
        assertThat(solution.addLast(input, "apple")).isEqualTo(output);
    }

    @Test
    @DisplayName("새롭게 추가한 String타입의 값이 포함된 ArrayList를 리턴해야 합니다")
    public void testFoo3() {
        ArrayList<String> input = new ArrayList<String>(Arrays.asList("code", "spring"));
        ArrayList<String> output = new ArrayList<String>(Arrays.asList("code", "spring", "coding"));
        assertThat(solution.addLast(input, "coding")).isEqualTo(output);
    }
}