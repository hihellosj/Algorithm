class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[] { -1 };
        }
        
        int min = arr[0];
        for (int n : arr) {
            if(n < min) min = n;
        }
        
        int[] result = new int[arr.length - 1];
        int idx = 0;
        
        for(int n : arr) {
            if( n != min) {
                result[idx++] = n;
            }
        }
        return result;
    }
}