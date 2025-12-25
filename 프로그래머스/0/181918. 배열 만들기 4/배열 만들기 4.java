class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        int[] stk = new int[n];
        int top = 0;
        int i = 0;

        while (i < n) {
            if (top == 0) {
                stk[top++] = arr[i++];
            } else if (stk[top - 1] < arr[i]) {
                stk[top++] = arr[i++];
            } else {
                top--; // pop (i는 증가 안 함)
            }
        }

        int[] result = new int[top];
        System.arraycopy(stk, 0, result, 0, top);
        return result;
    }
}
