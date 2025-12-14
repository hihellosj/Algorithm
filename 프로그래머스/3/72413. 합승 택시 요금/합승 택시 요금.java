import java.util.*;

class Solution {
    
    static class Node{
        int dest;
        int cost;
        
        Node(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }
    }
    
    static final int INF = Integer.MAX_VALUE; 
    
    public int solution(int n, int s, int a, int b, int[][] fares) {
        
        List<Node>[] graph = new ArrayList[n + 1];
        for(int i =1 ; i <= n ; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int[] f : fares) {
            int u = f[0] , v = f[1], w = f[2];
            graph[u].add(new Node(v, w));
            graph[v].add(new Node(u, w));
            
        }
        
        int[] distS = dijkstra(n, s, graph);
        int[] distA = dijkstra(n, a, graph);
        int[] distB = dijkstra(n, b, graph);
        
        int answer = INF;
        
        for(int i = 1; i <= n; i++) {
            if (distS[i] == INF || distA[i] == INF || distB[i] == INF) continue;
            answer = Math.min(answer, distS[i] + distA[i] + distB[i]);
        }
        
        return answer;
    }
    
    private int[] dijkstra(int n, int start, List<Node>[] graph) {
        int[] dist = new int[n+1];
        Arrays.fill(dist, INF);
        
        PriorityQueue<Node> pq =
            new PriorityQueue<>(Comparator.comparingInt(o->o.cost));
        
        dist[start] = 0;
        pq.offer(new Node(start, 0));
        
        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            
            if(dist[cur.dest] < cur.cost) continue;
            
            for(Node next : graph[cur.dest]) {
                int newCost = cur.cost + next.cost;
                if(newCost < dist[next.dest]) {
                    dist[next.dest] = newCost;
                    pq.offer(new Node(next.dest, newCost));
                }
            }
        }
        return dist;
    }
}