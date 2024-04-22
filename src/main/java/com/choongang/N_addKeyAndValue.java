package com.choongang;

import java.util.HashMap;

public class N_addKeyAndValue {
    public HashMap<String, Integer> addKeyAndValue(HashMap<String, Integer> hashMap, String key, int value) {
        // TODO:
        // <String, Integer> 타입을 요소로 가지는 HashMap과 Key, Value를 입력받아
        // HashMap에 Key-Value 쌍을 추가한 후 새롭게 추가된 요소를 포함한 HashMap을 리턴해야 합니다.


        hashMap.put(key, value);

        return hashMap;


    }
}
