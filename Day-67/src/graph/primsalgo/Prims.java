package graph.primsalgo;

import java.util.List;
import java.util.PriorityQueue;

public class Prims {

    public void prims(List<Edge> [] graph,int source){
        boolean[]visited=new boolean[3];

        PriorityQueue<Pair> pq= new PriorityQueue<>();
        Pair pair = new Pair(source,0);
        pq.add(pair);
        int total=0;
        while (!pq.isEmpty()){
            Pair p= pq.remove();
            int vertex=p.getDestination();
            if (!visited[vertex]){
                visited[vertex]=true;
                total=total+p.getWeight();
                for (Edge e : graph[vertex]){
                    Pair adj= new Pair(e.getDestination(),e.getWeight());
                    pq.add(adj);
                }
            }
        }
        System.out.println("Minimum cost : "+total);
    }
}
