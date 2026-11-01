package graph.sp.dijikstrasalgo;

public class Pair implements Comparable<Pair>{

    int vertex;
    int distance;

    public Pair(int vertex, int distance) {
        this.vertex = vertex;
        this.distance = distance;
    }

    @Override
    public int compareTo(Pair p) {
       return Integer.compare(this.distance,p.distance);
    }
}
