import java.util.*;

class Solution {
    public int[] solution(long n) {
        // 문자열로 변환 후 뒤집어서 각 자리수 추출
        String s = Long.toString(n);
        int[] answer = new int[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            // 뒤에서부터 꺼내어 배열에 넣기
            answer[i] = s.charAt(s.length() - 1 - i) - '0';
        }
        
        return answer;
    }
}
