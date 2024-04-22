package com.choongang;
import java.util.*;

public class B_getNthElement {
    public Integer getNthElement(ArrayList<Integer> arrayList, int index) {
        // TODO:
       // Integer 타입의 ArrayList와 수를 입력받아 수가 인덱스로 가리키는 ArrayList의 요소를 리턴해야 합니다.

        if (arrayList.size() == 0) {
            return null;
        } else if (arrayList.size() <= index) {
            return null;
        }

        return arrayList.get(index);
    }
}
