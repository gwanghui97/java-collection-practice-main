package com.choongang;

import java.util.ArrayList;

public class I_removeFromBackOfNew {
    public ArrayList<Integer> removeFromBackOfNew(ArrayList<Integer> arrayList) {
        // TODO:
        if (arrayList.isEmpty()) {
            return null;
        }
        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 1; i < arrayList.size(); i++) {
            a.add(i);
        }

        return a;
    }
}
