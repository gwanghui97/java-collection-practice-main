package com.choongang;

import java.util.HashMap;

public class W_select {
    public HashMap<String, Integer> select(String[] arr, HashMap<String, Integer> hashMap) {
        // TODO:
        HashMap<String, Integer> output = new HashMap<>();

        for (String s : arr) {
            if (hashMap.containsKey(s)) {
                output.put(s, hashMap.get(s));
            }
        }

        return output;
    }
}
