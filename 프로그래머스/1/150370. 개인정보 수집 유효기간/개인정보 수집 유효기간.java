import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termMap = new HashMap<>();
        
        for (String term : terms) {
            String[] t = term.split(" ");
            termMap.put(t[0], Integer.parseInt(t[1]));
        }
        
        int todayDays = toDays(today);
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < privacies.length; i++) {
            String[] p = privacies[i].split(" ");
            int startDays = toDays(p[0]);
            int months = termMap.get(p[1]);
            
            int expireDays = startDays + months * 28 - 1;
            
            if (todayDays > expireDays) {
                result.add(i + 1);
            }
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    private int toDays(String date) {
        String[] d = date.split("\\.");
        int y = Integer.parseInt(d[0]);
        int m = Integer.parseInt(d[1]);
        int day = Integer.parseInt(d[2]);
        
        return y * 12 * 28 + m * 28 + day;
    }
}