package org.day1;

import java.lang.String;

public class A006 {
    boolean solution(String s) {
        boolean answer = true;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        String str = s.toLowerCase();
        int count1 = 0, count2 = 0;

        for(char c : str.toCharArray()) {
            if(c == 'p') count1++;
            else if(c == 'y') count2++;
        }

        if(count1 > 0 || count2 > 0) {
            if(count1 != count2) {
                answer = false;
            }
        }

        return answer;
    }
}
