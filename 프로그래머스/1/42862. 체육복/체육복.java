import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lostList = new ArrayList<>();
        List<Integer> reserveList = new ArrayList<>();

        for (int l : lost) lostList.add(l);
        for (int r : reserve) reserveList.add(r);

        // 먼저 여벌 있는 학생이 도난당한 경우 제거
        Iterator<Integer> it = lostList.iterator();
        while (it.hasNext()) {
            int l = it.next();
            if (reserveList.contains(l)) {
                reserveList.remove(Integer.valueOf(l));
                it.remove();
            }
        }

        // 정렬은 안정성을 위해 해주는 것이 좋음
        Collections.sort(reserveList);
        Collections.sort(lostList);

        // 여벌 체육복 빌려주기
        for (int r : reserveList) {
            if (lostList.contains(r - 1)) {
                lostList.remove(Integer.valueOf(r - 1));
            } else if (lostList.contains(r + 1)) {
                lostList.remove(Integer.valueOf(r + 1));
            }
        }

        return n - lostList.size();
    }
}
