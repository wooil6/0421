package com.choongang;

import java.util.ArrayList;

public class D_addLast {
    public ArrayList<String> addLast(ArrayList<String> arrayList, String str) {
        // TODO:
       // String 타입을 요소로 가지는 ArrayList와 문자열 요소를 입력받아,
       // 주어진 요소를 ArrayList의 맨 뒤에 추가하고 해당 ArrayList를 리턴해야 합니다.

        arrayList.add(str);
        return arrayList;
    }
}
