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

class Q_getSizeTest {
    Q_getSize test = spy(Q_getSize.class);

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
    @DisplayName("반복문(for, while)을 사용하지 말아야 합니다")
    public void 반복문_사용_체크() {
        String path = "src/main/java/com/choongang/Q_getSize.java"; // 파일 위치
        String text = readLineByLineJava8(path);  //코드를 모두 java 파일로 변환
        assertThat(StringUtils.countMatches(text, "for")).isZero();
        assertThat(StringUtils.countMatches(text, "while")).isZero();
    }

    @Test
    @DisplayName("입력된 HashMap의 정확한 크기를 리턴해야 합니다")
    public void testFoo() {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(){{
            put(1, 10);
            put(2, 20);
            put(3, 30);
        }};
        assertThat(test.getSize(map)).isEqualTo(3);
    }

    @Test
    @DisplayName("입력된 HashMap의 정확한 크기를 리턴해야 합니다")
    public void testFoo2() {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(){{
            put(1, 10);
            put(2, 20);
        }};
        assertThat(test.getSize(map)).isEqualTo(2);
    }

    @Test
    @DisplayName("입력된 HashMap의 정확한 크기를 리턴해야 합니다")
    public void testFoo3() {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(){{
            put(1, 10);
            put(2, 20);
            put(3, 30);
            put(4, 330);
            put(5, 430);
        }};
        assertThat(test.getSize(map)).isEqualTo(5);
    }
}