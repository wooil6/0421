package com.choongang;

import java.util.ArrayList;

public class E_addNth {
    public ArrayList<Integer> addNth(ArrayList<Integer> arrayList, int index, int element) {
        // TODO:
        // 타입을 요소로 가지는 ArrayList와 추가할 위치의 인덱스, 정수를 입력받아
        // 주어진 요소를 ArrayList의 인덱스에 추가하고 해당 ArrayList를 리턴해야 합니다.

        if (arrayList.size() <= index) {
            return null;
        }

        //arrayList.get(index, element);
        arrayList.add(index, element);

        return arrayList;
    }
}
