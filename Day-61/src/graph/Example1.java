package graph;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter number of vertices");
        int vCount=kb.nextInt();

        int [][] adj=new int[vCount][vCount];

        for (int i = 0; i <vCount ; i++) {
            for (int j = 0; j <vCount ; j++) {

                System.out.println("is there a path from V"+(1+i)+" to V"+(1+j)+" yes-1 or no-0");
                adj[i][j]= kb.nextInt();

            }
        }

        for (int i = 0; i <vCount ; i++) {
            for (int j = 0; j <vCount ; j++) {
                System.out.print(adj[i][j]);
            }
            System.out.println();
        }
    }
}
