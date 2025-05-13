class Solution {
    int[] numbers;
    int target;
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        return dfs(0,0);
    }
    
    
    private int dfs(int idx, int sum){
        if(idx == numbers.length){
            if(target == sum) {
                return 1;
            }
            return 0;
        }
        
        return dfs(idx+1, sum+numbers[idx]) + dfs(idx+1, sum-numbers[idx]);
        
    }
    
}