package com.choongang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class L_sumAllElements {
    public int sumAllElements(ArrayList<Integer> arrayList) {
        // TODO:
        int output = 0;
        Iterator<Integer> iter = arrayList.iterator();

        while (iter.hasNext()) {
            output += iter.next();
        }

        return output;
    }
}
