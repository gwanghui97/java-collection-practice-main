package com.choongang;

import java.util.ArrayList;

public class C_getLastElement {
    public String getLastElement(ArrayList<String> arrayList) {
        // TODO:
        String output = null;

        if (arrayList.isEmpty()) {
            return null;
        }

        output = arrayList.get(arrayList.size() - 1);

        return output;
    }
}
