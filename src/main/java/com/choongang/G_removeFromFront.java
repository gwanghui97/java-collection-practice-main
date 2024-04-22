package com.choongang;

import java.util.ArrayList;

public class G_removeFromFront {
    public Integer removeFromFront(ArrayList<Integer> arrayList) {
        // TODO:
        if (arrayList.size() == 0) {
            return null;
        }
        Integer result = arrayList.remove(0);
        return result;
    }
}
