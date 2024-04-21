package com.choongang;

import java.util.HashMap;

public class X_countAllCharacter {
    public HashMap<Character, Integer> countAllCharacter(String str) {
        // TODO:
        if (str.isEmpty()) {
            return null;
        }

        HashMap<Character, Integer> output = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (output.containsKey(c)) {
                int value = output.get(c);
                output.put(c, value + 1);
            } else {
                output.put(c, 1);
            }
        }

        return output;
    }
}
