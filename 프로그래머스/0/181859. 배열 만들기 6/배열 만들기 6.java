class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        int[] stk = new int[n];
        int top = 0;

        for (int i = 0; i < n; i++) {
            if (top == 0) {
                stk[top++] = arr[i];
            } else {
                if (stk[top - 1] == arr[i]) {
                    top--;          // pop
                } else {
                    stk[top++] = arr[i]; // push
                }
            }
        }

        if (top == 0) {
            return new int[]{-1};
        }

        int[] result = new int[top];
        System.arraycopy(stk, 0, result, 0, top);
        return result;
    }
}
