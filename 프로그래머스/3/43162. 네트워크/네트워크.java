class Solution {
    boolean[] visited;
    int[][] computers;
    
    public int solution(int n, int[][] computers) {
        this.computers = computers;
        int answer = 0;
        visited = new boolean[n];
        
        
    
        
        
        for(int i = 0; i < n; i++) {
            if(!visited[i]){
                dfs(i);
                answer++;
            }
            
        }
        
        
        return answer;
    }
    
    
    private void dfs(int x) {
        for(int i = 0; i < computers[0].length; i++){
            if(!visited[i] && i!=x && computers[x][i] == 1) {
                visited[i] = true;
                dfs(i);
                
            }
        }
    }
}