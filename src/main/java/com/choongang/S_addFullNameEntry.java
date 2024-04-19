package com.choongang;

import java.util.Collection;
import java.util.HashMap;

public class S_addFullNameEntry {
    public HashMap<String, String> addFullNameEntry(HashMap<String, String> hashMap) {
        // TODO:
        hashMap.put("fullName", hashMap.get("firstName") + hashMap.get("lastName"));

        return hashMap;
    }
}
