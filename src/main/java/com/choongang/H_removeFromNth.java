package com.choongang;

import java.util.ArrayList;

public class H_removeFromNth {
    public String removeFromNth(ArrayList<String> arrayList, int index) {
        // TODO:
        //String 타입을 요소로 가지는 ArrayList와 인덱스를 입력받아,
        // ArrayList에 인덱스의 요소를 삭제한 후 해당 요소를 리턴해야 합니다.


        if (arrayList.size() <= index){
            return null;
        }

        String newArrayList = arrayList.remove(index);

        return newArrayList;
    }
}
