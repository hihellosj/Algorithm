import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> a = new ArrayList<>();
        
        //내림차순 정렬
        Arrays.sort(score);
        
        
        for(int i = score.length-1; i >= 0; i--) {
            
            a.add(score[i]);
            if(a.size() == m) {
               
                answer += a.get(m-1) * m;
                a = new ArrayList<>();
            }
        }
        return answer;
    }
}
