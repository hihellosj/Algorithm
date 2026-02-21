import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length()];
        
        Map<Character, Integer> lastIndex = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(!lastIndex.containsKey(c)){
                result[i] = -1;
            } else {
                result[i] = i - lastIndex.get(c);
            }
            lastIndex.put(c, i);
        }
        return result;
        
    }
}