class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int a = -1, b = -1, c = -1;

        for (int r = 1; r <= rank.length; r++) { // 등수 1등부터 확인
            for (int i = 0; i < rank.length; i++) {
                if (rank[i] == r && attendance[i]) {
                    if (a == -1) a = i;
                    else if (b == -1) b = i;
                    else {
                        c = i;
                        return 10000 * a + 100 * b + c;
                    }
                }
            }
        }
        return 0; // 조건상 도달 안 함
    }
}
