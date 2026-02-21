import java.util.*;

class Solution {
    public int[] solution(long n) {
        List<Integer> list = new ArrayList<>();
        
        while (n > 0) {
            list.add((int)(n % 10)); // 마지막 자리수 추가
            n /= 10;                  // 마지막 자리 제거
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
