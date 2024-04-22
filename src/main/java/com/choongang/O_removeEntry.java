package com.choongang;

import java.util.HashMap;

public class O_removeEntry {
    public void removeEntry(HashMap<String, Integer> hashMap, String key) {
        // TODO:
        // <String, Integer> 타입을 요소로 가지는 HashMap과 문자열을 입력받아,
        // String 타입의 변수 key를 키(key)로 가지고있는 Entry를 제거합니다.

        hashMap.remove(key);
    }
}
