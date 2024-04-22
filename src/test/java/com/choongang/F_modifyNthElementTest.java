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

class F_modifyNthElementTest {
    F_modifyNthElement solution = spy(F_modifyNthElement.class);

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
        String path = "src/main/java/com/choongang/F_modifyNthElement.java"; // 파일 위치
        String text = readLineByLineJava8(path);  //코드를 모두 java 파일로 변환
        assertThat(StringUtils.countMatches(text, "for")).isZero();
        assertThat(StringUtils.countMatches(text, "while")).isZero();
    }

    @Test
    @DisplayName("ArrayList의 add()와 remove()를 사용할 수 없습니다.")
    public void testSet() {
        String path = "src/main/com/codestates/coplit/Solution.java";
        String text = readLineByLineJava8(path);
        assertThat(StringUtils.countMatches(text, "add")).isZero();
        assertThat(StringUtils.countMatches(text, "remove")).isZero();
    }

    @Test
    @DisplayName("범위를 벗어난 index를 인자로 받을경우 null을 리턴해야 합니다")
    public void testFoo() {
        ArrayList<String> input = new ArrayList<String>(Arrays.asList("a", "b", "c"));
        assertThat(solution.modifyNthElement(input, 9, "d")).isEqualTo(null);
    }

    @Test
    @DisplayName("수정한 값이 정확한 위치에 포함된 ArrayList를 리턴해야 합니다")
    public void testFoo2() {
        ArrayList<String> input = new ArrayList<String>(Arrays.asList("a", "b", "c"));
        ArrayList<String> output = new ArrayList<String>(Arrays.asList("a", "b", "d"));
        assertThat(solution.modifyNthElement(input, 2, "d")).isEqualTo(output);
    }

    @Test
    @DisplayName("수정한 값이 정확한 위치에 포함된 ArrayList를 리턴해야 합니다")
    public void testFoo3() {
        ArrayList<String> input = new ArrayList<String>(Arrays.asList("고기", "햄버거", "순대", "음료수"));
        ArrayList<String> output = new ArrayList<String>(Arrays.asList("고기", "햄버거", "순대", "콜라"));
        assertThat(solution.modifyNthElement(input, 3, "콜라")).isEqualTo(output);
    }
}