package com.choongang;

import java.util.ArrayList;

public class F_modifyNthElement {
    public ArrayList<String> modifyNthElement(ArrayList<String> arrayList, int index, String str) {
        // TODO:
        String a = str;

        if (index > arrayList.size() - 1) {
            return null;
        }

        arrayList.set(index, a);

        return arrayList;
    }
}
