package com.choongang;

import java.util.ArrayList;
import java.util.Arrays;

public class J_arrayToArrayList {
    public ArrayList<String> arrayToArrayList(String[] arr) {
        // TODO:
        if (arr.length == 0) {
            return null;
        }

        ArrayList<String> output = new ArrayList<>();

        for (String s : arr) {
            output.add(s);
        }

        return output;
    }
}
