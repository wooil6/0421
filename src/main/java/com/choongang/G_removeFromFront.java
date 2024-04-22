package com.choongang;

import java.util.ArrayList;

public class G_removeFromFront {
    public Integer removeFromFront(ArrayList<Integer> arrayList) {
        // TODO:
        // Integer 타입을 요소로 가지는 ArrayList를 입력받아
        // ArrayList의 첫번째 요소를 삭제하고, 삭제된 해당 요소를 리턴해야 합니다.

        if (arrayList.size() == 0) {
            return null;
        }

        Integer newArrayList = arrayList.remove(0);

        return newArrayList;

    }
}
