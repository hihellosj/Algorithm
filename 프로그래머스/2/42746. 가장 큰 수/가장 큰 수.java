import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }
        
        // 커스텀 정렬: 두 수를 이어붙였을 때 더 큰 순서로 정렬
        Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));

        // "000..." 예외 처리 (모든 값이 0이면 0 하나만 출력)
        if (str[0].equals("0")) return "0";

        
        for(String a : str) {
            answer+=a;
        }
        
        
        return answer;
    }
}