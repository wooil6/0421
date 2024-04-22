package com.choongang;

import java.util.ArrayList;

public class F_modifyNthElement {
    public ArrayList<String> modifyNthElement(ArrayList<String> arrayList, int index, String str) {
        // TODO:
        //ArrayList와 요소, 수정할 위치의 인덱스를 입력받아
        // 주어진 요소를 ArrayList의 인덱스의 값을 수정하고 해당 ArrayList를 리턴해야 합니다.

        if (arrayList.size() <= index) {
            return null;
        }

        arrayList.set(index, str);

        return arrayList;
    }
}
