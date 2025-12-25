import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Set<Integer> seen = new HashSet<>();
        int idx = 0;

        for (int num : arr) {
            if (!seen.contains(num)) {
                seen.add(num);
                if (idx < k) {
                    answer[idx++] = num;
                }
            }
            if (idx == k) break;
        }

        // 나머지 값이 있다면 -1로 채움
        while (idx < k) {
            answer[idx++] = -1;
        }

        return answer;
    }
}
