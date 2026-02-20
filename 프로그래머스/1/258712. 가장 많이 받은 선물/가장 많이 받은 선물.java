import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        
        int n = friends.length;
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(friends[i], i);
        }
        
        int[][] giftCount = new int[n][n];
        int[] giftScore = new int[n];
        
        for (String g : gifts) {
            String[] split = g.split(" ");
            int from = map.get(split[0]);
            int to = map.get(split[1]);
            
            giftCount[from][to]++;
            giftScore[from]++;
            giftScore[to]--;
        }
        
        int[] nextMonth = new int[n];
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (giftCount[i][j] > giftCount[j][i]) {
                    nextMonth[i]++;
                }else if(giftCount[i][j] < giftCount[j][i]) {
                    nextMonth[j]++;
                }
                else{
                    if (giftScore[i] > giftScore[j]) {
                        nextMonth[i] ++;
                    } else if (giftScore[i] < giftScore[j]) {
                        nextMonth[j]++;
                    }
                }
            }
        }
        
        int answer = 0;
        for (int val : nextMonth) {
            answer = Math.max(answer, val);
        }
        
        return answer;
    }
}
