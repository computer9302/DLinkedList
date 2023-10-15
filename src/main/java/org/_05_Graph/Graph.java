package org._05_Graph;

import java.util.ArrayList;


public class Graph {
    public static void main(String[] args) {
        int[][] edges = new int[][]{
                {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 5}, {4, 5}
        };

        int n = 5;

        // 배열 + 리스트
        // ArrayList<Integer>[] list = new ArrayList[n+1];

        // 리스트 + 리스트
         ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // 배열 + 리스트
        // for (int i = 0; i <= n; i++) list[i] = new ArrayList<>();

        // 리스트 + 리스트
         for (int i = 0; i <= n ; i++) list.add(new ArrayList<>());

        for (int[] edge : edges){
           // list[edge[0]].add(edge[1]);
            list.get(edge[0]).add(edge[1]);
            System.out.println("edge = " + edge[0]);
           // list[edge[1]].add(edge[0]);
            list.get(edge[1]).add(edge[0]);
            System.out.println("edge = " + edge[1]);
        }
/*
        //출력(배열 + 리스트)
        for (int i = 1; i <= n; i++){
            for (int j = 0; j < list[i].size(); j++){
                System.out.print(list[i].get(j)+" ");
            }
            System.out.println();
        }
*/

        //출력(리스트 + 리스트)
        for (int i = 1; i < list.size(); i++){
            for (int j = 0; j < list.get(i).size(); j++){
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
}