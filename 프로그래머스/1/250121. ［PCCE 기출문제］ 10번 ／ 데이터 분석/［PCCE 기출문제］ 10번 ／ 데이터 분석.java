import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> idx = new HashMap<>();
        idx.put("code", 0);
        idx.put("date", 1);
        idx.put("maximum", 2);
        idx.put("remain", 3);

        int extIdx = idx.get(ext);
        int sortIdx = idx.get(sort_by);

        List<int[]> filtered = new ArrayList<>();

        // 1. 조건 필터링
        for (int[] row : data) {
            if (row[extIdx] < val_ext) {
                filtered.add(row);
            }
        }

        // 2. 정렬
        filtered.sort(Comparator.comparingInt(o -> o[sortIdx]));

        // 3. 결과 변환
        return filtered.toArray(new int[filtered.size()][]);
    }
}
