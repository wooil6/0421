package com.choongang;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class C_getLastElementTest {
    C_getLastElement solution;

    @BeforeEach
    void setUp() {
        solution = new C_getLastElement();
    }

    @Test
    @DisplayName("빈 ArrayList의 경우 null을 리턴해야 합니다.")
    public void testFoo() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList());
        assertThat(solution.getLastElement(list)).isEqualTo(null);
    }

    @Test
    @DisplayName("[\"사과\", \"바나나\", \"포도\", \"오렌지\"]를 입력받은 경우 \"오렌지\"를 리턴해야 합니다.")
    public void testFoo2() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("사과", "바나나", "포도","오렌지"));
        assertThat(solution.getLastElement(list)).isEqualTo("오렌지");
    }

    @Test
    @DisplayName("[\"코드\", \"스프링\", \"코딩\"]를 입력받은 경우, \"코딩\"을 리턴해야 합니다.")
    public void testFoo3() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("코드", "스프링", "코딩"));
        assertThat(solution.getLastElement(list)).isEqualTo("코딩");
    }
}