package com.choongang;

import java.util.ArrayList;

public class H_removeFromNth {
    public String removeFromNth(ArrayList<String> arrayList, int index) {
        // TODO:
        if (arrayList.isEmpty()) {
            return null;
        }

        if (index > arrayList.size() - 1) {
            return null;
        }

        String remove = arrayList.remove(index);

        return remove;
    }
}
