package graph.sp.dijikstrasalgo;

import java.util.ArrayList;
import java.util.List;

public class UseDijikstra {
    public static void main(String[] args) {
        int V=5;
        List<Edge>[] graph=new ArrayList[V];

        for (int i = 0; i <V ; i++) {
            graph[i]= new ArrayList<>();
        }

        graph[0].add(new Edge(1, 4));
        graph[0].add(new Edge(2, 1));

        graph[2].add(new Edge(1, 2));

        graph[1].add(new Edge(3, 1));

        graph[2].add(new Edge(3, 5));

        graph[3].add(new Edge(4, 3));


        Dijikstra dijikstra= new Dijikstra();
        dijikstra.dijikstra(graph,0);

    }
}
