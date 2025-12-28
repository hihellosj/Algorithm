class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        
        int pCount = 0;
        int yCount = 0;
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'p') pCount++;
            if(ch == 'y') yCount++;
        }

       
        return pCount == yCount;
    }
}