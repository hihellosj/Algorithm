class Solution {
    int[][] computer;
    boolean[] visit;
    
    private void dfs (int now) { 
        visit[now] = true;
        for(int i = 0; i < computer[now].length; i++) {
            if(!visit[i] && computer[now][i] == 1) {
                dfs(i);
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        computer = computers;
        visit = new boolean[n];
        int answer = 0;
        
        for(int i = 0 ; i < n; i++){
             if(!visit[i]) {
                dfs(i);
                answer++;
            }
        }
        
        
       
        
        
        return answer;
    }
}