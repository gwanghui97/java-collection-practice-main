package com.choongang;

import java.util.ArrayList;
import java.util.Arrays;

public class J_arrayToArrayList {
    public ArrayList<String> arrayToArrayList(String[] arr) {
        // TODO:
        if (arr.length == 0) {
            return null;
        }

        ArrayList<String> newArrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            newArrayList.add(arr[i]);
        }
        // 다른 방법 1, 2, 3
//        for (String str : arr) {
//            newArrayList.add(str);
//        }

//        Collection.addAll(newArrList, arr);

//        return new ArrayList<>(Arrays.asList(arr));

        return newArrayList;
    }
}
