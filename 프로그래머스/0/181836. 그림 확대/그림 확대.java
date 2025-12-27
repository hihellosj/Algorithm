import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> result = new ArrayList<>();

        for (String row : picture) {
            StringBuilder sb = new StringBuilder();
            // 가로 k배
            for (char c : row.toCharArray()) {
                for (int i = 0; i < k; i++) {
                    sb.append(c);
                }
            }
            String expandedRow = sb.toString();
            // 세로 k배
            for (int i = 0; i < k; i++) {
                result.add(expandedRow);
            }
        }

        return result.toArray(new String[0]);
    }
}
