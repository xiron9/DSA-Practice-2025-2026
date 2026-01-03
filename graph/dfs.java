import java.util.*;

class dfsstack{
    private int V;
       private ArrayList<ArrayList<Integer>> adj;

public  dfsstack(int V){
    this.V = V;
    adj = new ArrayList<>();
    for(int i=0;i<V;i++) adj.add(new ArrayList<>());
}

//add edge
public void addedge(int u,int v, boolean directed){
    adj.get(u).add(v);
    if(!directed) adj.get(v).add(u);
}
// main code
public void dfs{
boolean [] visited=new boolean[V];
Stack<Integer> stack=new Stack<>();
stack.push(start);
System.out.println("traversal starts with " + start);

while(!stack.isEmpty()){

    int node=stack.pop();
    if(!visited[node]){
        visited[node]=true;
    System.out.println(node + " ");
    }


// fidning all neighbours

       for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) stack.push(neighbor);
            }
}
      System.out.println();
 }
}



public class dfs {
    public static void main(String[] args) {
        GraphDFS g1 = new GraphDFS(5);
        g1.addEdge(0, 1, false);
        g1.addEdge(0, 2, false);
        g1.addEdge(1, 3, false);
        g1.addEdge(2, 4, false);

        g1.dfs(0); // Recursive DFS

        dfsstack g2 = new dfsstack(5);
        g2.addEdge(0, 1, false);
        g2.addEdge(0, 2, false);
        g2.addEdge(1, 3, false);
        g2.addEdge(2, 4, false);

        g2.dfs(0); // Iterative DFS
    }
}
