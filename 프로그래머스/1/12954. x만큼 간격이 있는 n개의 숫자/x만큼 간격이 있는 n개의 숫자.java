class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long r = 0;
        
        for(int i = 0; i < n; i++){
            r += x;
            answer[i] = r;
        }
        
        return answer;
    }
}