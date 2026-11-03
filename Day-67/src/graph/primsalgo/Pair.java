package graph.primsalgo;

public class Pair implements Comparable<Pair>{
    int weight;
    int destination;

    public Pair( int destination,int weight) {
        this.weight = weight;
        this.destination = destination;
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


    @Override
    public int compareTo(Pair o) {
        return this.weight-o.weight;
    }
}
