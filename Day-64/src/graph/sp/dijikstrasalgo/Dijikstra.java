package graph.sp.dijikstrasalgo;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Dijikstra {

    public  void dijikstra(List<Edge>[] graph, int source){

        int V = graph.length;

        int[] distance=new int[V];

        Arrays.fill(distance, Integer.MAX_VALUE);

        int [] parent = new int[V];

        Arrays.fill(parent,-1);

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        distance[source]=0;

        pq.add(new Pair(source,0));

        while (!pq.isEmpty()){

            Pair current = pq.poll();

            int u=current.vertex;

            int currentDistance= current.distance;

            if (currentDistance> distance[u]){
                continue;
            }

            for (Edge edge : graph[u]){
                int v=edge.destination;
                int weight = edge.weight;

                int newDistance = currentDistance+weight;

                if (newDistance<distance[v]){
                    distance[v]=newDistance;
                    parent[v]=u;
                    pq.add(new Pair(v,newDistance));
                }
            }
        }
        System.out.println("Shortest distances");
        for (int i =0; i<V;i++){

            if (distance[i]==Integer.MAX_VALUE){
            System.out.println(source+"-> "+i+ " = unreachable");
            }

            else {
                System.out.println(source+"-> "+i+ " = "+distance[i]);
            }
        }

        System.out.println("\nShortest Paths : ");

        for (int i = 0; i <V ; i++) {
            System.out.print(source+" -> "+i+" : ");

            if (distance[i]==Integer.MAX_VALUE){
                System.out.println("No path exists");
            }else {
                printPath(parent,i);
                System.out.println();
            }
        }
    }

    private void printPath(int[] parent, int destination) {
        if (parent[destination] == -1) {
            System.out.print(destination);
            return;
        }

        printPath(parent, parent[destination]);

        System.out.print(" -> " + destination);
    }
}
