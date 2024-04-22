package com.choongang;

import java.util.HashMap;

public class X_countAllCharacter {
    public HashMap<Character, Integer> countAllCharacter(String str) {
        // TODO:
        if (str.isEmpty()) {
            return null;
        }

        // 1. 주어진 문자열 str을 캐릭터 배열로 변경
        char[] arr = str.toCharArray();
        // 2. 결과를 담을 map 선언.
        HashMap<Character, Integer> reslut = new HashMap<>();
        // 3. 캐릭터 배열을 순회
        for (char c : arr) {
            // 2-1. 각 배열의 요소인 char가 키로 이미 존재하는지 확인
            if (reslut.containsKey(c)) {
                // 2-1-2. 존재한다면 헤딩 키의; 기존의 값 +1인 값으로 덮어씌우기(put)
                    // 기존의 키 가져오기
                Integer currentValue = reslut.get(c);
                reslut.put(c, currentValue + 1);
            } else {
                // 2-1-1. 존재하지 않는다면, 해당 키에 값을 1로 넣어서 map에 추가(put)
                reslut.put(c, 1);
            }

        }

        // 4. 순회가 끝나면 해당 map 반환
        return reslut;
    }
}
