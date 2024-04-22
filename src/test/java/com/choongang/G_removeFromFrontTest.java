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

class G_removeFromFrontTest {

    G_removeFromFront solution = spy(G_removeFromFront.class);

    @Test
    @DisplayName("비어있는 ArrayList를 입력받은 경우 null을 리턴해야 합니다")
    public void testFoo() {
        ArrayList<Integer> input = new ArrayList<Integer>();
        assertThat(solution.removeFromFront(input)).isEqualTo(null);
    }

    @Test
    @DisplayName("첫번째 요소가 삭제된 ArrayList를 리턴해야 합니다")
    public void testFoo2() {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> output = new ArrayList<Integer>(Arrays.asList(2,3,4,5));
        assertThat(solution.removeFromFront(input)).isEqualTo(1);
    }

    @Test
    @DisplayName("추가한 값이 정확한 위치에 포함된 ArrayList를 리턴해야 합니다")
    public void testFoo3() {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5));
        ArrayList<Integer> output = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        assertThat(solution.removeFromFront(input)).isEqualTo(0);
    }

    @Test
    @DisplayName("추가한 값이 정확한 위치에 포함된 ArrayList를 리턴해야 합니다")
    public void testFoo4() {
        ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(1,2,3,0,4,5));
        ArrayList<Integer> output = new ArrayList<Integer>(Arrays.asList(2,3,0,4,5));
        assertThat(solution.removeFromFront(input)).isEqualTo(1);
    }
}