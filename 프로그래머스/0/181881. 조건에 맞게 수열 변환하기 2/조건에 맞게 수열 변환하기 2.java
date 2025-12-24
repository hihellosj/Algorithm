import java.util.*;

class Solution {
    public int solution(int[] arr) {
         int n = arr.length;
        int[] prev = Arrays.copyOf(arr, n);
        int[] curr = new int[n];
        int x = 0;

        while (true) {
            for (int i = 0; i < n; i++) {
                int val = prev[i];
                if (val >= 50 && val % 2 == 0) {
                    curr[i] = val / 2;
                } else if (val < 50 && val % 2 == 1) {
                    curr[i] = val * 2 + 1;
                } else {
                    curr[i] = val;
                }
            }

            x++;
            if (Arrays.equals(prev, curr)) {
                return x - 1; // arr(x) = arr(x+1)인 최소 x
            }

            // prev 배열을 curr로 갱신
            int[] tmp = prev;
            prev = curr;
            curr = tmp;
        }
    }
}