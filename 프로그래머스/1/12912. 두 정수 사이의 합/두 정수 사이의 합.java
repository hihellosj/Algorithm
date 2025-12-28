class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long sum = 0;
        int x, y;
        x = Math.min(a, b);
        y = Math.max(a, b);
        for(int i = x; i <= y; i++){
            sum += i;
        }
        return sum;
    }
}