import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Map<Integer, Integer> count = new HashMap<>();
        
        // 각 숫자의 등장 횟수 계산
        for (int num : dice) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        int size = count.size();
        
        if (size == 1) {
            // 네 개가 모두 같음
            int p = dice[0];
            return 1111 * p;
        } else if (size == 2) {
            // 두 가지 숫자만 있음 -> 3+1 또는 2+2
            List<Integer> keys = new ArrayList<>(count.keySet());
            int p = keys.get(0);
            int q = keys.get(1);
            int cp = count.get(p);
            int cq = count.get(q);
            
            if (cp == 3 || cq == 3) {
                // 3+1
                int three = cp == 3 ? p : q;
                int one = cp == 1 ? p : q;
                return (10 * three + one) * (10 * three + one);
            } else {
                // 2+2
                return (p + q) * Math.abs(p - q);
            }
        } else if (size == 3) {
            // 2+1+1
            int pair = -1;
            List<Integer> single = new ArrayList<>();
            for (int key : count.keySet()) {
                if (count.get(key) == 2) {
                    pair = key;
                } else {
                    single.add(key);
                }
            }
            return single.get(0) * single.get(1);
        } else {
            // 모두 다름
            int min = Arrays.stream(dice).min().getAsInt();
            return min;
        }
    }
}
