import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> collatz = new ArrayList<>();
        collatz.add(n);
        
        while(n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            collatz.add(n);
        }
       // List<Integer> → int[] 변환
        int[] result = new int[collatz.size()];
        for (int i = 0; i < collatz.size(); i++) {
            result[i] = collatz.get(i);
        }
        return result;
    }
}