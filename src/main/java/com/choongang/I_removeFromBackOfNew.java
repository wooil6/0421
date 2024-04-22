package com.choongang;

import java.util.ArrayList;

public class I_removeFromBackOfNew {
    public ArrayList<Integer> removeFromBackOfNew(ArrayList<Integer> arrayList) {
        // TODO:
        // ArrayList와 요소를 입력받아,
        // 마지막 요소가 제거된 새로운 ArrayList을 리턴해야 합니다.

        if (arrayList.size() == 0) {
            return null;
        }

        ArrayList<Integer> newArrayList = new ArrayList<>(arrayList);

        newArrayList.remove(arrayList.size() - 1);
        return newArrayList;
    }
}
