import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length; // exclusive
        
        for (int i = 0; i < query.length; i++) {
            int q = query[i];
            if (i % 2 == 0) { // 짝수 인덱스: 뒤 자르기
                end = start + q + 1;
            } else { // 홀수 인덱스: 앞 자르기
                start = start + q;
            }
        }
        
        return Arrays.copyOfRange(arr, start, end);
    }
}
