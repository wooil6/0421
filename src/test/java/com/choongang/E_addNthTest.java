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

class E_addNthTest {
    E_addNth solution = spy(E_addNth.class);

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
        String path = "src/main/java/com/choongang/E_addNth.java"; // 파일 위치
        String text = readLineByLineJava8(path);  //코드를 모두 java 파일로 변환
        assertThat(StringUtils.countMatches(text, "for")).isZero();
        assertThat(StringUtils.countMatches(text, "while")).isZero();
    }

    @Test
    @DisplayName("범위를 벗어난 index를 인자로 받을경우 null을 리턴해야 합니다")
    public void testFoo() {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        assertThat(solution.addNth(input, 9, 0)).isEqualTo(null);
    }

    @Test
    @DisplayName("추가한 값이 정확한 위치에 포함된 ArrayList를 리턴해야 합니다")
    public void testFoo2() {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> output = new ArrayList<Integer>(Arrays.asList(1,7,2,3,4,5));
        assertThat(solution.addNth(input, 1, 7)).isEqualTo(output);
    }

    @Test
    @DisplayName("추가한 값이 정확한 위치에 포함된 ArrayList를 리턴해야 합니다")
    public void testFoo3() {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> output = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5));
        assertThat(solution.addNth(input, 0, 0)).isEqualTo(output);
    }

    @Test
    @DisplayName("추가한 값이 정확한 위치에 포함된 ArrayList를 리턴해야 합니다")
    public void testFoo4() {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> output = new ArrayList<Integer>(Arrays.asList(1,2,3,0,4,5));
        assertThat(solution.addNth(input, 3, 0)).isEqualTo(output);
    }

}