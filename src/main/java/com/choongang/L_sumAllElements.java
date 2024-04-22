package com.choongang;

import java.util.ArrayList;
import java.util.Iterator;

public class L_sumAllElements {
    public int sumAllElements(ArrayList<Integer> arrayList) {
        // TODO:
        // Integer 타입의 ArrayList를 입력받아
        // 모든 요소를 더한 값을 리턴해야 합니다.

        if (arrayList.size() == 0) {
            return 0;
        }

        Iterator<Integer> iterator = arrayList.iterator();

        int sum = 0;

        while (iterator.hasNext()) {
            sum = sum + iterator.next();
        }

        return sum;

    }
}
