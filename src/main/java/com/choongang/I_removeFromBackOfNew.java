package com.choongang;

import java.util.ArrayList;

public class I_removeFromBackOfNew {
    public ArrayList<Integer> removeFromBackOfNew(ArrayList<Integer> arrayList) {
        // TODO:
        if (arrayList.size() == 0) {
            return null;
        }

        // 1. 반복문을 arrayList.size() - 1 번 돌면서 (반복문)
        // 새로운 List에 값을 저장하고 반환
        ArrayList<Integer> newArrayList = new ArrayList<>();

        for (int i = 0; i < arrayList.size() - 1; i++) {
            Integer currentEl = arrayList.get(i);
            newArrayList.add(currentEl);
        }
        // 2. arrayList를 복사한 후, 해당 새로운 List의 마지막 요소를 제거하고 반환

        return newArrayList;
    }
}
