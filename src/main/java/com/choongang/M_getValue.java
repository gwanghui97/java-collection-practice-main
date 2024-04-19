package com.choongang;

import java.util.HashMap;
import java.util.Map;

public class M_getValue {
    public Integer getValue(HashMap<String, Integer> hashMap, String key) {
        // TODO:
        Integer output = 0;

        for (String s : hashMap.keySet()) {
            output = hashMap.get(key);
        }

        return output;
    }
}
