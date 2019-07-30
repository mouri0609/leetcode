package code.graph;

import java.util.LinkedList;

public class graphMatrix {
    private int v;

    //�ڽӾ���
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
        //����ͼ�Ļ��������ɾ��
        adj[t][s] = v;
    }
}
