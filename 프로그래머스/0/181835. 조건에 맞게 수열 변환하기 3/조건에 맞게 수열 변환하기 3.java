class Solution {
    public int[] solution(int[] arr, int k) {
        boolean isOdd = (k % 2 == 1);
        
        for(int i = 0; i < arr.length; i++){
            if (isOdd) {
                arr[i] *= k;
            } else {
                arr[i] += k;
            }
        }
        return arr;
    }
}