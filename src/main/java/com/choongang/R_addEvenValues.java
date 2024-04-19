package com.choongang;

import java.util.HashMap;

public class R_addEvenValues {
    public int addEvenValues(HashMap<Character, Integer> hashMap) {
        // TODO:
        int output = 0;

        for (Character c : hashMap.keySet()) {
            Integer num = hashMap.get(c);
            if (num % 2 == 0) {
                output += num;
            }
        }

        return output;
    }
}
