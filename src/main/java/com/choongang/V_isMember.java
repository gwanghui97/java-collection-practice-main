package com.choongang;

import java.util.HashMap;

public class V_isMember {
    public boolean isMember(HashMap<String, String> member, String username, String password) {
        // TODO:
        if (member.containsKey(username)) {
            String value = member.get(username);
            if (value.equals(password)) {
                return true;
            }
        }
        return false;
    }
}
