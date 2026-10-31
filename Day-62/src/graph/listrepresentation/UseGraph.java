package graph.listrepresentation;

public class UseGraph {
    public static void main(String[] args) {
        Graph graph=new Graph(5);

        graph.addEdge(0,new Edge(0,1,6));

        graph.addEdge(1,new Edge(1,0,6));
        graph.addEdge(1,new Edge(1,2,2));
        graph.addEdge(1,new Edge(1,3,3));


        graph.addEdge(2,new Edge(2,1,2));
        graph.addEdge(2,new Edge(2,3,1));
        graph.addEdge(2,new Edge(2,4,4));

        graph.addEdge(3,new Edge(3,1,3));
        graph.addEdge(3,new Edge(3,2,1));

        graph.addEdge(4,new Edge(4,2,4));

//        graph.BFS(1);
        graph.DFS(1);



    }
}
