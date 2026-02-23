import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> yn = new HashMap<>();
        
        for(int i = 0; i < name.length; i++) {
            yn.put(name[i], yearning[i]);
        }
        
        int[] result = new int[photo.length];
        
        for (int j = 0; j < photo.length; j++) {
            int sum = 0;
            for(String pn : photo[j]) {
                
                sum += yn.getOrDefault(pn, 0);
        
            }
            result[j]  = sum;
        }
        return result;
    }
}