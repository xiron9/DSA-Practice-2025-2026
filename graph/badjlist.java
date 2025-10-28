import java.util.*;
class adjlist{
    private int V; //vertices
   private ArrayList<ArrayList<Integer>> adj;
    
 public adjlist(int V){
    this.V=V;
    adj=new ArrayList<>();
    for(int i=0;i<V;i++){
        adj.add(new ArrayList<>());
    }
 }

// addedges
public void addEdge(int u,int v,boolean directed){
  adj.get(u).add(v);
  if(!directed) adj.get(v).add(u);
}
//print delete
public void removeEdge(int u,int v,boolean directed){
   adj.get(u).remove(Integer.valueOf(v));
   if(!directed) adj.get(v).remove(Integer.valueOf(u));
}
//print neighbour
public void printNeighbors(int u){
    System.out.print("neighbours of " + u + " : ");
    for(int v: adj.get(u)){
        System.out.print(v + "");
    }
    System.out.println();
}
  // Print entire adjacency list
    public void printGraph() {
        System.out.println("\nAdjacency List:");
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int v : adj.get(i)) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}

public class badjlist {
    public static void main(String[] args) {
        adjlist g = new adjlist(4); // vertices 0,1,2,3

        // Add edges
        g.addEdge(0, 1, true);   // directed 0 -> 1
        g.addEdge(0, 2, true);   // directed 0 -> 2
        g.addEdge(1, 3, false);  // undirected edge between 1 and 3

        // Print graph
        g.printGraph();

        // Print neighbors
        g.printNeighbors(0);
        g.printNeighbors(1);

        // Remove an edge
        g.removeEdge(1, 3, false);
        System.out.println("\nAfter removing edge (1,3):");
        g.printGraph();
    }
}