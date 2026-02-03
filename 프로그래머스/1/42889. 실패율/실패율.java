import java.util.*;

class Solution {
    static class Stage {
        int num;
        double rate;

        Stage(int num, double rate) {
            this.num = num;
            this.rate = rate;
        }
    }

    public int[] solution(int N, int[] stages) {
        int[] cnt = new int[N + 2];

        // 스테이지별 멈춘 인원 수
        for (int s : stages) {
            cnt[s]++;
        }

        List<Stage> list = new ArrayList<>();
        int total = stages.length;

        // 실패율 계산
        for (int i = 1; i <= N; i++) {
            double failRate = 0;
            if (total != 0) {
                failRate = (double) cnt[i] / total;
            }
            list.add(new Stage(i, failRate));
            total -= cnt[i];
        }

        // 정렬
        Collections.sort(list, (a, b) -> {
            if (Double.compare(b.rate, a.rate) != 0) {
                return Double.compare(b.rate, a.rate); // 실패율 내림차순
            }
            return a.num - b.num; // 번호 오름차순
        });

        // 결과 추출
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = list.get(i).num;
        }

        return answer;
    }
}
