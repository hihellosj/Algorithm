class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        int size = 1;

        while (size < n) {
            size <<= 1; // size *= 2
        }

        int[] result = new int[size];
        System.arraycopy(arr, 0, result, 0, n);
        return result;
    }
}