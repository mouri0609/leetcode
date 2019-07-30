package code.graph;

import java.util.LinkedList;

public class graphMatrix {
    private int v;

    //邻接矩阵
    private int[][] adj;

    public graphMatrix(int v){
        this.v = v;

        adj = new int[v][v];

        for (int i = 0; i < v; i++) {
            for (int j = 0;j<v;j++) {
                adj[i][j] = 0;
            }
        }
    }

    public void add(int s, int t,int v) {
        adj[s][t] = v;
        //有向图的话下面这个删除
        adj[t][s] = v;
    }
}
