import java.util.*;

class Solution {
    
    private static final int[] dx = {0,0,-1,1};
    private static final int[] dy = {1,-1,0,0};
    
    private class Node{
        int x;
        int y;
        
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        int[][] dist = new int[n][m];
        
        ArrayDeque<Node> deque = new ArrayDeque<>();
        
        deque.add(new Node(0, 0));
        dist[0][0] = 1;
        
        while(!deque.isEmpty()){
            Node now = deque.poll();
            for(int i = 0; i < 4; i++){
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                
                if(nx<0 || ny<0 || nx>=n || ny>=m)
                    continue;
                if(maps[nx][ny] == 0)
                    continue;
                if(dist[nx][ny]>=1)
                    continue;
                
                dist[nx][ny] = dist[now.x][now.y]+1;
                deque.add(new Node(nx, ny));
                
            }
        }
        
        
        
        return dist[n-1][m-1] == 0 ? -1 : dist[n-1][m-1];
    }
}