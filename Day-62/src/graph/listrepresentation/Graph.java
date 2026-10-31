package graph.listrepresentation;

import java.util.*;

public class Graph {
    private List<Edge>[] mylist;

    public Graph(int size){
        mylist=new ArrayList[size];
        for (int i = 0; i <size ; i++) {
            mylist[i]=new ArrayList<>();
        }
    }

    public void addEdge(int index,Edge e){
        mylist[index].add(e);
    }

    public void BFS(int source){
        boolean [] visited=new boolean[mylist.length];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(source);
        visited[source]=true;


        while (!queue.isEmpty()) {
            int v = queue.remove();
            System.out.println("Vertex "+v+" visited");
            for (Edge e:mylist[v]){
                int destination = e.getDestination();

                if (!visited[destination]){
                    visited[destination]=true;
                    queue.add(destination);
                }
            }
        }
    }


    public void DFS(int source){
        boolean [] visited= new boolean[5];
        Stack<Integer>stack=new Stack<>();
        stack.push(source);
        visited[source]=true;

        while (!stack.isEmpty()){
            int v=stack.pop();
            System.out.println("Vertex "+v+" visited");
            for (Edge e : mylist[v]){

                int destination=e.getDestination();

                if (!visited[destination]){
                    visited[destination]=true;
                    stack.push(destination);
                }
            }
        }
    }
}
