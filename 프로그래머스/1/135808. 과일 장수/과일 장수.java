import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        // 내림차순 정렬
        Arrays.sort(score);

        int n = score.length;
        int profit = 0;

        // 뒤에서부터 m개씩 묶기
        for (int i = n - m; i >= 0; i -= m) {
            int minScoreInBox = score[i];
            profit += minScoreInBox * m;
        }

        return profit;
    }
}
