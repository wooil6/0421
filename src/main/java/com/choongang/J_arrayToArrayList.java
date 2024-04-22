package com.choongang;

import java.util.ArrayList;
import java.util.Arrays;

public class J_arrayToArrayList {
    public ArrayList<String> arrayToArrayList(String[] arr) {
        // TODO:
        //String 타입을 요소로 가지는 배열을 입력받아,
        // String 타입을 요소로 가지는 ArrayList로 변환하여 리턴해야 합니다.

        if (arr.length == 0) {
            return null;
        }

       ArrayList<String> arrayToArrayList = new ArrayList<>(Arrays.asList(arr));


        return arrayToArrayList;
    }
}
