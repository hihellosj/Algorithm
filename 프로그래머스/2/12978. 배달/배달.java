import java.util.*;

class Solution {

    private static class Node {
        int dest;
        int cost;

        Node(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }
    }

    public int solution(int N, int[][] road, int K) {
        int[] dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        List<Node>[] graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] r : road) {
            int a = r[0], b = r[1], c = r[2];
            graph[a].add(new Node(b, c));
            graph[b].add(new Node(a, c));
        }

        PriorityQueue<Node> pq =
            new PriorityQueue<>(Comparator.comparingInt(n -> n.cost));

        dist[1] = 0;
        pq.offer(new Node(1, 0));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();

            if (dist[cur.dest] < cur.cost) continue;

            for (Node next : graph[cur.dest]) {
                int newCost = cur.cost + next.cost;
                if (dist[next.dest] > newCost) {
                    dist[next.dest] = newCost;
                    pq.offer(new Node(next.dest, newCost));
                }
            }
        }

        int answer = 0;
        for (int i = 1; i <= N; i++) {
            if (dist[i] <= K) answer++;
        }

        return answer;
    }
}
