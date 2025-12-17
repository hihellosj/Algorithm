class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] result = new int[num_list.length - (n - 1)];
        int idx = 0;
        
        for(int i = n-1; i < num_list.length; i++) {
            result[idx++] = num_list[i];
        }
        return result;
    }
}