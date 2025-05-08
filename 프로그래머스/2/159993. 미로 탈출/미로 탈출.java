import java.util.*;

class Solution {
    private static int[] dx = {0,0,1,-1};
    private static int[] dy = {1,-1,0,0};
    
    private class Point{
        int x;
        int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    private static char[][] map;
    private static int N,M;  
    
    public int solution(String[] maps) {
        N = maps.length;
        M = maps[0].length();
        
        map = new char[N][M];
        
        for (int i = 0 ; i<N; i++) {
            map[i] = maps[i].toCharArray();
        }
        
        Point start = null, end = null, leber = null;
        
        for(int i = 0; i < N ; i++) {
            for(int j = 0; j < M; j++) {
                if(map[i][j]=='S'){
                    start = new Point(i, j);
                }else if(map[i][j]=='L'){
                    leber = new Point(i, j);
                }else if(map[i][j]=='E'){
                    end = new Point(i, j);
                }
            }
        }
        
        int startLeber = bfs(start, leber);
        int leberEnd = bfs(leber, end);
        
        
         return startLeber != -1 && leberEnd != -1 ? startLeber+leberEnd : -1;
    }
    
    private int bfs(Point start, Point end){
        int[][] dist = new int[N][M];
        ArrayDeque<Point> queue = new ArrayDeque<>();
        dist[start.x][start.y] = 1;
        queue.add(start);
        
        while(!queue.isEmpty()){
            Point now = queue.poll();
            
            for(int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                
                if(nx < 0 || ny < 0 || nx >= N || ny >= M) 
                    continue;
                
                if(map[nx][ny] == 'X')
                    continue;
                
                if(dist[nx][ny] > 0)
                    continue;
                
                dist[nx][ny] = dist[now.x][now.y] + 1;
                queue.add(new Point(nx, ny));
                
                if(nx == end.x && ny == end.y) {
                    return dist[end.x][end.y] -1;
                }
                
            }
            
        }
        
        return -1;
        
    }
    
}