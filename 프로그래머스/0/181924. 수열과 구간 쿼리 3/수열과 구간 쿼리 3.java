class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] q : queries) {
            int i = q[0];
            int j = q[1];

            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }
}