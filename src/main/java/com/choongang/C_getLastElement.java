package com.choongang;

import java.util.ArrayList;

public class C_getLastElement {
    public String getLastElement(ArrayList<String> arrayList) {
        // TODO:
      //  문자열타입의 ArrayList를 입력받아 마지막 요소를 리턴해야 합니다.

        if (arrayList.size() == 0) {
            return null;
        }

        return arrayList.get(arrayList.size() -1);
    }
}
