import java.util.*;

class Adjacency{
    private int V;
    private boolean [][] mat;


public Adjacency(int V){
    this.V=V;
    mat=new boolean[V][V];
}
// add edge
public void addedge(int u,int v,boolean directed){
   mat[u][v]=true;
   if(!directed) mat[v][u]=true;
}
//delete
public void deleteedge(int u,int v,boolean directed){
   mat[u][v]=false;
   if(!directed) mat[v][u]=false;
}
// check
public boolean hasEdge(int u,int v){
 return mat[u][v];
}
//print neighbour
public void neighbour(int u){
    System.out.print("neighbour of :"+ u + " : ");
    for(int v=0;v<V;v++){
        if(mat[u][v]) System.out.print(v + " ");
    }
  System.out.println();
}
// print final matrix
public void printmatrix(){
    System.out.println("\n Adjacenecy amtrix");
    for(int i=0;i<V;i++){
        for(int j=0;j<V;j++){
            System.out.print((mat[i][j] ? 1: 0 )+ " " );
        }
        System.out.println();
    }
  }
}

class adjmaf {
 public static void main(String[] args) {
    Adjacency j=new Adjacency(4);

    //print
    j.addedge(0, 1, false);
    j.addedge(0, 2, false);
    j.addedge(0, 3, false);

    //print matrix
    //j.printmatrix();

    j.deleteedge(0, 3, false);
    System.out.print("after delete the edge 0,3" );
  //  j.printmatrix();
    j.neighbour(0);

   System.out.println("present this edge or not" + j.hasEdge(0, 3));
 }    
}
