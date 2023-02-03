package com.mycompany.graph;

import java.util.ArrayList;
import java.util.Scanner;

class Graph_Input{
    Graph_Input(){
        AdjacencyMatrix();
    }
    void AdjacencyMatrix(){
        int connections[][] = {
            {0,1,0,1,1,0},  
            {1,0,1,1,0,0},  
            {0,1,0,1,0,0},  
            {1,1,1,0,0,0},  
            {1,0,0,0,0,1},  
            {0,0,0,0,1,0},  
        };
        
        int row = 6, column = 6;
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                System.out.print(" "+connections[i][j]);
            }
            System.out.println("");
        }
    }
}


class GraphUserInput{  /// Graph usign Adjacency Matrix from user input
    int matrix[][];
    int vertices;
    GraphUserInput(){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        vertices = ob.nextInt();
        matrix = new int[vertices][vertices];
        System.out.println("Enter the adjacency matrix: ");
        for(int i=0; i<vertices; i++)
        {
            for(int j=0; j<vertices; j++)
            {
                System.out.println("Matrix ["+i+"]["+j+"]");
                matrix[i][j] = ob.nextInt();
            }
        }
        System.out.println("The Adjacency Matrix is: ");
        for(int i=0; i<vertices; i++)
        {
            for(int j=0; j<vertices; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}


class GraphListInput{ /// Works on both directed & undirected graph
    
    GraphListInput(){
        
        Scanner ob = new Scanner(System.in);
        int x, r=6;
        ArrayList<ArrayList<Integer>> List = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<r; i++)
        {
            System.out.println("Enter edges of node "+i+": ");
            ArrayList<Integer> nList = new ArrayList<Integer>();
            for(int j=0; ; j++)
            {
                x = ob.nextInt();
                if(x==-1)
                {
                    break;
                }
                nList.add(x);
            }
            List.add(nList);
        }
        for(int i=0; i<r; i++)
        {
            System.out.print("Connection of Node "+i+":");
            for(int j=0; j<List.get(i).size(); j++)
            {
                System.out.print(" "+List.get(i).get(j));
            }
            System.out.println("");
        }
    }
}


class GraphListInputType2{ ///For Undirected graph
    GraphListInputType2(){
        ArrayList<ArrayList<Integer>> list;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int vertices = ob.nextInt();
        list = new ArrayList<ArrayList<Integer>>(vertices);
        for(int i=0; i<vertices; i++)
        {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            list.add(temp);
        }
        System.out.println("Enter the edges: ");
        while(ob.hasNextInt()){
            int u = ob.nextInt();
            int v = ob.nextInt();
            list.get(u).add(v);
            list.get(v).add(u);
        }
        System.out.println("The graph is: ");
        for(int i=0; i<vertices; i++)
        {
            System.out.println("Vertex "+ i + "is connected to: ");
            for(int j=0; j<list.get(i).size(); j++){
                System.out.println(" "+list.get(i).get(j));
            }
            System.out.println("");
        }
    }
}

class GraphListInputType3{ ///For directed graph
    GraphListInputType3(){
        ArrayList<ArrayList<Integer>> list;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int vertices = ob.nextInt();
        list = new ArrayList<ArrayList<Integer>>(vertices);
        for(int i=0; i<vertices; i++)
        {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            list.add(temp);
        }
        System.out.println("Enter the edges: ");
        while(ob.hasNextInt()){
            int u = ob.nextInt();
            int v = ob.nextInt();
            list.get(u).add(v);
        }
        System.out.println("The graph is: ");
        for(int i=0; i<vertices; i++)
        {
            System.out.println("Vertex "+ i + "is connected to: ");
            for(int j=0; j<list.get(i).size(); j++){
                System.out.println(" "+list.get(i).get(j));
            }
            System.out.println("");
        }
    }
}

public class Graph {

    public static void main(String[] args) {
        Graph_Input object = new Graph_Input();
//        GraphUserInput object2 = new GraphUserInput();
//        GraphListInput object3 = new GraphListInput();
//        GraphListInputType2 object4 = new GraphListInputType2();
//        GraphListInputType3 object5 = new GraphListInputType3();
    }
}
