import java.util.*;

class GraphBFS {
    private int V;  // number of vertices
    private ArrayList<ArrayList<Integer>> adj;  // adjacency list

    // Constructor
    public GraphBFS(int V) {
        this.V = V;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
    }

    // Add edge (can be directed or undirected)
    public void addEdge(int u, int v, boolean directed) {
        adj.get(u).add(v);
        if (!directed) adj.get(v).add(u);
        //hehehehheehhe
    }

    // BFS Traversal from a source node
    public void bfs(int start) {
        boolean[] visited = new boolean[V]; // visited array
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true; // mark start as visited
        q.offer(start);        // push start vertex

        System.out.print("BFS Traversal starting from " + start + ": ");

        while (!q.isEmpty()) {
            int node = q.poll(); // remove front node
            System.out.print(node + " ");

            // explore neighbors
            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.offer(neighbor);
                }
            }
        }
        System.out.println();
    }

    // Print adjacency list
    public void printGraph() {
        System.out.println("\nAdjacency List:");
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int v : adj.get(i)) System.out.print(v + " ");
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        GraphBFS g = new GraphBFS(5);

        // Add edges (undirected)
        g.addEdge(0, 1, false);
        g.addEdge(0, 2, false);
        g.addEdge(1, 3, false);
        g.addEdge(2, 4, false);

        g.printGraph();

        // Perform BFS from node 0
        g.bfs(0);
    }
}
















