class Solution {
    public long solution(long n) {
        long sqrt = (long) Math.sqrt(n); // n의 제곱근 구하기
        if (sqrt * sqrt == n) {          // 정수 제곱인지 확인
            return (sqrt + 1) * (sqrt + 1);
        } else {
            return -1;
        }
    }
}
