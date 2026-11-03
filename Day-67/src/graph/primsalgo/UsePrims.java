package graph.primsalgo;

import java.util.ArrayList;
import java.util.List;

public class UsePrims {
    public static void main(String[] args) {
        List<Edge>[] graph=new ArrayList [3];

        for (int i = 0; i <3 ; i++) {
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,3));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,2,2));

        graph[2].add(new Edge(2,0,3));
        graph[2].add(new Edge(2,1,2));

        Prims prims= new Prims();
        prims.prims(graph,0);

    }
}
