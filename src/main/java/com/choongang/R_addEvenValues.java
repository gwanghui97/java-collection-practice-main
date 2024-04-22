package com.choongang;

import java.util.HashMap;

public class R_addEvenValues {
    public int addEvenValues(HashMap<Character, Integer> hashMap) {
        // TODO:
        int result = 0;

        for (Character key : hashMap.keySet()) {
            Integer value = hashMap.get(key);
            if (value % 2 == 0) {
                result += value;
            }
        }
        return result;
    }
}
