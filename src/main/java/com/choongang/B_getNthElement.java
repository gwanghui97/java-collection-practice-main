package com.choongang;
import java.util.*;

public class B_getNthElement {
    public Integer getNthElement(ArrayList<Integer> arrayList, int index) {
        // TODO:
        if (arrayList.size() == 0) {
            return null;
        } else if (index >= arrayList.size()) {
            return null;
        }

        return arrayList.get(index);
    }
}