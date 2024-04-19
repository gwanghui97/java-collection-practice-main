package com.choongang;

import java.util.ArrayList;

public class G_removeFromFront {
    public Integer removeFromFront(ArrayList<Integer> arrayList) {
        // TODO:
        if (arrayList.isEmpty()) {
            return null;
        }

        Integer remove = arrayList.remove(0);

        return remove;
    }
}
