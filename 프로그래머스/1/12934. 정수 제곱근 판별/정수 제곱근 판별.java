class Solution {
    public long solution(long n) {
        long sqrt = (long)Math.sqrt(n); // n의 제곱근 구하기
        if (sqrt * sqrt == n) {
            return (sqrt + 1) * (sqrt + 1);
        } else {
            return -1;
        }
    }
}
