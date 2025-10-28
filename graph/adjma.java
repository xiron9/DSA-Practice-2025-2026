// Adjacency Matrix Implementation in Java
import java.util.*;

class AdjMatrix {
    private int V;           // number of vertices (nodes)
    private boolean[][] mat; // adjacency matrix

    public AdjMatrix(int V) {
        this.V = V;
        mat = new boolean[V][V];
    }

    // Add an edge u -> v
    public void addEdge(int u, int v, boolean directed) {
        mat[u][v] = true;
        if (!directed) mat[v][u] = true; // if undirected, add both ways
    }

    // Remove edge u -> v
    public void removeEdge(int u, int v, boolean directed) {
        mat[u][v] = false;
        if (!directed) mat[v][u] = false;
    }

    // Check if edge exists between u and v
    public boolean hasEdge(int u, int v) {
        return mat[u][v];
    }

    // Print all neighbours of node u
    public void printNeighbors(int u) {
        System.out.print("Neighbors of " + u + ": ");
        for (int v = 0; v < V; v++) {
            if (mat[u][v]) System.out.print(v + " ");
        }
        System.out.println();
    }

    // Print the adjacency matrix
    public void printMatrix() {
        System.out.println("\nAdjacency Matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print((mat[i][j] ? 1 : 0) + " ");
            }
            System.out.println();
        }
    }
}

public class adjma {
    public static void main(String[] args) {
        AdjMatrix g = new AdjMatrix(4); // 4 vertices: 0,1,2,3

        // Add edges
        g.addEdge(0, 1, true);   // directed 0 -> 1
        g.addEdge(0, 2, true);   // directed 0 -> 2
        g.addEdge(1, 3, false);  // undirected between 1 and 3

        // Print matrix
        g.printMatrix();

        // Print neighbours
        g.printNeighbors(0);
        g.printNeighbors(1);

        // Check if an edge exists
        System.out.println("\nDoes edge (1 -> 3) exist? " + g.hasEdge(1, 3));

        // Remove edge
        g.removeEdge(0, 1, false);
        System.out.println("\nAfter removing edge (0,1):");
        g.printMatrix();
    }
}
