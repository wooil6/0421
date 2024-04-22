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

class L_sumAllElementsTest {
    L_sumAllElements test = spy(L_sumAllElements.class);

    private static String readLineByLineJava8(String filePath) {  // .java code to String
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
    @DisplayName("Iterator를 사용해야 합니다")
    public void 반복문_사용_체크() {
        String path = "src/main/java/com/choongang/L_sumAllElements.java"; // 파일 위치
        String text = readLineByLineJava8(path);  //코드를 모두 java 파일로 변환
        assertThat(StringUtils.countMatches(text, "Iterator")).isNotZero();
    }

    @Test
    @DisplayName("1, 2, 3, 4, 5의 요소를 가진 ArrayList를 입력받을 경우 15를 리턴해야 합니다")
    public void testFoo() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertThat(test.sumAllElements(list)).isEqualTo(15);
    }

    @Test
    @DisplayName("12, 23, 45의 요소를 가진 ArrayList를 입력받을 경우 80를 리턴해야 합니다")
    public void testFoo2() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12, 23, 45));
        assertThat(test.sumAllElements(list)).isEqualTo(80);
    }

    @Test
    @DisplayName("비어있는 ArrayList를 입력받을 경우 0을 리턴해야 합니다")
    public void testFoo3() {
        ArrayList<Integer> list = new ArrayList<>();
        assertThat(test.sumAllElements(list)).isEqualTo(0);
    }
}