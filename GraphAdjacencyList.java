import java.util.ArrayList;
public class GraphAdjacencyList
{
    public static void main(String args[])
    {
        int v=5;
        ArrayList<ArrayList<Integer>> adj =  new ArrayList<ArrayList<Integer>>();
        
        //adding vertices
        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        
        //adding edges
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
        
        printList(adj);
    }
    
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int v, int u)
    {
        adj.get(v).add(u);
        adj.get(u).add(v);
    }
    
    static void printList(ArrayList<ArrayList<Integer>> adj)
    {

        for(int i=0; i<adj.size(); i++)
        {
            System.out.println("Adjacency list for vertex : "+i);
            System.out.print("head");
            for(int j=0;j<adj.get(i).size();j++)
            {
                System.out.print(" -> ");
                System.out.print(adj.get(i).get(j));
            }
             System.out.println();
            
        }
        
        // write code with new for loop:
        //for(ArrayList<Integer> varr: adj){}

        // re-write code with forEach loop:
        //adj.forEach(varr -> varr.forEach(u -> System.out.println(u)));
    }
}

