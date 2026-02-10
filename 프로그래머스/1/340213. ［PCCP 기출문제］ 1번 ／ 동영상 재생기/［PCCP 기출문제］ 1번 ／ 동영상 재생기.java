class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video = toSec(video_len);
        int cur = toSec(pos);
        int opS = toSec(op_start);
        int opE = toSec(op_end);

        for (String cmd : commands) {
            // 1️⃣ 명령 수행 전 오프닝 스킵
            if (cur >= opS && cur <= opE) {
                cur = opE;
            }

            // 2️⃣ 명령 처리
            if (cmd.equals("prev")) {
                cur = Math.max(0, cur - 10);
            } else { // next
                cur = Math.min(video, cur + 10);
            }

            // 3️⃣ 명령 수행 후 오프닝 스킵
            if (cur >= opS && cur <= opE) {
                cur = opE;
            }
        }

        return String.format("%02d:%02d", cur / 60, cur % 60);
    }

    private int toSec(String time) {
        String[] t = time.split(":");
        return Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
    }
}
