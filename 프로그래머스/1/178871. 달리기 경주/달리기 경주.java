import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rank = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            rank.put(players[i], i);
        }
        
        for (String call : callings) {
            int idx = rank.get(call);
            int frontIdx = idx - 1;
            
            String frontPlayer = players[frontIdx];
            
            players[frontIdx] = call;
            players[idx] = frontPlayer;
            
            rank.put(call, frontIdx);
            rank.put(frontPlayer, idx);
        }
        return players;
    }
}