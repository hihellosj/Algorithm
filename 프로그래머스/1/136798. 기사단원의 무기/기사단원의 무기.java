class Solution {
    public int solution(int number, int limit, int power) {
        int[] divisor = new int[number + 1];

        // 약수 개수 계산
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                divisor[j]++;
            }
        }

        int sum = 0;

        // 공격력 계산
        for (int i = 1; i <= number; i++) {
            if (divisor[i] > limit) {
                sum += power;
            } else {
                sum += divisor[i];
            }
        }

        return sum;
    }
}
