package code.graph;

import java.util.LinkedList;
import java.util.Queue;

//��һ����ô���Ȩ�����ڽӱ�
public class graphLinkTable {

    private int v;

    //�ڽӱ�
    private LinkedList<Integer>[] adj;

    public graphLinkTable(int v){
        this.v = v;

        adj = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void add(int s, int t) {
        adj[s].add(t);
        //����ͼ�Ļ��������ɾ��
        adj[t].add(s);
    }

}
