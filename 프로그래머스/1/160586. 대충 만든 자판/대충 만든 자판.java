import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] minPress = new int[26];
        Arrays.fill(minPress, Integer.MAX_VALUE);
        for(String key : keymap) {
            for(int i = 0; i < key.length(); i++) {
                int idx = key.charAt(i) - 'A';
                minPress[idx] = Math.min(minPress[idx], i + 1);
            }
        }
        int[] answer = new int[targets.length];
        for(int i = 0; i < targets.length; i++) {
            int sum = 0;
            for(char c : targets[i].toCharArray()) {
                int idx = c - 'A';
                if(minPress[idx] == Integer.MAX_VALUE) {
                    sum = -1;
                    break;
                }
                sum += minPress[idx];
            }
            answer[i] = sum;
        }
        return answer;
    }
}