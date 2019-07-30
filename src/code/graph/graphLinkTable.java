package code.graph;

import java.util.LinkedList;
import java.util.Queue;

//想一想怎么存带权有向邻接表
public class graphLinkTable {

    private int v;

    //邻接表
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
        //有向图的话下面这个删除
        adj[t].add(s);
    }

}
