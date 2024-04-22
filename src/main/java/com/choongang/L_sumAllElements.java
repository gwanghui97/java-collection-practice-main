package com.choongang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class L_sumAllElements {
    public int sumAllElements(ArrayList<Integer> arrayList) {
        // TODO:
        if (arrayList.size() == 0) {
            return 0;
        }

        int sumNum = 0;

        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer nextNumber = iterator.next();
            sumNum += nextNumber;
            iterator.remove();
        }
        return sumNum;
    }
}
