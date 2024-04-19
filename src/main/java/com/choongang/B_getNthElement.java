package com.choongang;
import java.util.*;

public class B_getNthElement {
    public Integer getNthElement(ArrayList<Integer> arrayList, int index) {
        // TODO:
        Integer output = null;

        if (arrayList.isEmpty()) {
            return null;
        } else if(arrayList.size() < index){
            return null;
        }

        output = arrayList.get(index);

        return output;
    }
}
