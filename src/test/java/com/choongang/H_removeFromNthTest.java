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

class H_removeFromNthTest {
    H_removeFromNth solution = spy(H_removeFromNth.class);


    @Test
    @DisplayName("범위를 벗어난 index를 인자로 받을경우 null을 리턴해야 합니다")
    public void testFoo() {
        ArrayList<String> input = new ArrayList<String>(Arrays.asList("1","2","3","4","5"));
        assertThat(solution.removeFromNth(input, 9)).isEqualTo(null);
    }

    @Test
    @DisplayName("해당 index의 값이 삭제된 ArrayList를 리턴해야 합니다")
    public void testFoo2() {
        ArrayList<String> input = new ArrayList<String>(Arrays.asList("a","b","c","d","e"));
        ArrayList<String> output = new ArrayList<String>(Arrays.asList("a","c","d","e"));
        assertThat(solution.removeFromNth(input, 1)).isEqualTo("b");
    }

    @Test
    @DisplayName("해당 index의 값이 삭제된 ArrayList를 리턴해야 합니다")
    public void testFoo3() {
        ArrayList<String> input = new ArrayList<String>(Arrays.asList("김코딩", "자바", "스프링", "톰캣"));
        ArrayList<String> output = new ArrayList<String>(Arrays.asList("김코딩", "자바", "스프링"));
        assertThat(solution.removeFromNth(input, 3)).isEqualTo("톰캣");
    }

    @Test
    @DisplayName("해당 index의 값이 삭제된 ArrayList를 리턴해야 합니다")
    public void testFoo4() {
        ArrayList<String> input = new ArrayList<String>(Arrays.asList("code", "states", "spring"));
        ArrayList<String> output = new ArrayList<String>(Arrays.asList("code", "states"));
        assertThat(solution.removeFromNth(input, 2)).isEqualTo("spring");
    }

}