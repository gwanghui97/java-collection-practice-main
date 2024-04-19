package com.choongang;

import java.util.ArrayList;

public class E_addNth {
    public ArrayList<Integer> addNth(ArrayList<Integer> arrayList, int index, int element) {
        // TODO:
        Integer a = element;

        if (index > arrayList.size() - 1) {
            return null;
        }

        arrayList.add(index, a);

        return arrayList;
    }
}
