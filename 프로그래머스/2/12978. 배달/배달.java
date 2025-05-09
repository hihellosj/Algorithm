import java.util.*;

class Solution {
    
    private class Node{
        int dest;
        int cost;
        
        public Node(int dest, int cost){
            this.dest = dest;
            this.cost = cost;
        }
    }
    
    
    public int solution(int N, int[][] road, int K) {
        int answer = 0;

        int[] arr = new int[N+1];
        
        Arrays.fill(arr, Integer.MAX_VALUE);
        
        ArrayList<Node>[] adjList = new ArrayList[N+1];
     
        for(int i = 0; i < N+1; i++){
            adjList[i] = new ArrayList<Node>();
        }
        
        for(int[] r : road){
            int a = r[0];
            int b = r[1];
            int c = r[2];
            
            adjList[a].add(new Node(b,c));
            adjList[b].add(new Node(a,c));
        }
        
        PriorityQueue<Node> queue = new PriorityQueue<>((o1, o2)-> Integer.compare(o1.cost, o2.cost));
        arr[1] = 0;
        queue.add(new Node(1, 0));
        
        while(!queue.isEmpty()){
            Node now = queue.poll();

            // 이미 더 짧은 거리로 방문한 적이 있다면 스킵
            if (arr[now.dest] < now.cost) continue;

            for (Node next : adjList[now.dest]) {
                int newCost = now.cost + next.cost;

                // 더 짧은 거리라면 갱신
                if (arr[next.dest] > newCost) {
                    arr[next.dest] = newCost;
                    queue.add(new Node(next.dest, newCost));
                }
            }
        }
        
        for(int res : arr){
            if(res<=K){
                answer++;
            }
        }

        return answer;
    }
}