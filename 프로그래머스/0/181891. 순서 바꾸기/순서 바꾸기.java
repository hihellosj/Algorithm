class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] result = new int[len];
        int idx = 0;
        
        for(int i = n; i < len; i++) {
            result[idx++] = num_list[i];
            
        }
        
        for(int i = 0; i < n; i++) {
            result[idx++] = num_list[i];
            
        }
        return result;
    }
}