class Solution {
    public int solution(String s) {
        int answer = 0;
        int i = 0;
        
        while(i < s.length()) {
            char x = s.charAt(i);
            int cntX = 0;
            int cntOther = 0;
            
            while(i < s.length()) {
                if(s.charAt(i) == x){
                    cntX++;
                } else {
                    cntOther++;
                }
                i++;
                
                if(cntX == cntOther) {
                    break;
                }
            }
            answer++;
        }
        return answer;
        
    }
}