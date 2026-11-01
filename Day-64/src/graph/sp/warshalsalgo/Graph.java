package graph.sp.warshalsalgo;

import java.util.Scanner;

public class Graph {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        int row,col;
        System.out.println("Enter number of vertices");
        row=kb.nextInt();
        col=row;
        int [] [] weight=new int[row][col];
        for (int i = 0; i <row ; i++) {
            for (int j=0;j<col;j++){
                System.out.println("Is there direct path from V["+(i+1)+"]"+"to V["+(j+1)+"]:yes->weight,no->0");
                weight[i][j]=kb.nextInt();
            }
        }

        int [][] sp=new int[row][col];
        warshall(weight,sp);
        System.out.println("Shortest path matrix");
        for (int i = 0; i <sp.length ; i++) {
            for (int j = 0; j <sp.length ; j++) {
                System.out.print(sp[i][j]+" ");

            }
            System.out.println();

        }
    }

    private static void warshall(int[][] weight, int[][] sp) {
        int INFINITY=1000000;
        for (int i = 0; i < sp.length ; i++) {
            for (int j = 0; j <sp[i].length ; j++) {
                if (weight[i][j] > 0) {
                    sp[i][j] = weight[i][j];
                }
                else
                    sp[i][j]=INFINITY;
            }
        }

        for (int k = 0; k < sp.length ; k++) {
            for (int i = 0; i <sp.length ; i++) {
                for (int j = 0; j < sp.length; j++) {
                    if (sp[i][j]>sp[i][k]+sp[k][j]){
                        sp[i][j]=sp[i][k]+sp[k][j];
                    }
                }
            }

        }
    }
}
