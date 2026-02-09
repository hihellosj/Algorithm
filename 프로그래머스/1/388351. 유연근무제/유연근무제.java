class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int n = schedules.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int limit = toMinute(schedules[i]) + 10;
            boolean ok = true;

            for (int d = 0; d < 7; d++) {
                int weekday = (startday - 1 + d) % 7;
                if (weekday >= 5) continue; // 토, 일 제외

                int arrive = toMinute(timelogs[i][d]);
                if (arrive > limit) {
                    ok = false;
                    break;
                }
            }

            if (ok) count++;
        }

        return count;
    }

    private int toMinute(int t) {
        return (t / 100) * 60 + (t % 100);
    }
}
