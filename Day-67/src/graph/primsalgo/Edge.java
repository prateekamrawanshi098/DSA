package graph.primsalgo;

public class Edge {
    int source;
    int destination;

    public Edge(int source) {
        this.source = source;
    }

    int weight;

    public Edge(int source,int destination,int weight) {
        this.destination = destination;
        this.weight = weight;
        this.source = source;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }
}
