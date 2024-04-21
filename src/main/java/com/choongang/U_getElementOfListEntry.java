package com.choongang;

import java.util.*;

public class U_getElementOfListEntry {
    public String getElementOfListEntry(HashMap<String, List<String>> hashMap, String key, int index) {
        // TODO:
        if (index > hashMap.size() - 1) {
            return null;
        }

        if (!hashMap.containsKey(key)) {
            return null;
        }

        List<String> list = hashMap.get(key);

        return list.get(index);
    }
}
