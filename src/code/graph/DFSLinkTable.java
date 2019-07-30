package code.graph;

import java.util.LinkedList;

import static jdk.nashorn.internal.objects.Global.print;

public class DFSLinkTable {

    private int v; // ����ĸ���
    private LinkedList<Integer> adj[]; // �ڽӱ�

    public DFSLinkTable(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int s, int t) { // ����ͼһ���ߴ�����
        adj[s].add(t);
        adj[t].add(s);
    }


    boolean found = false; // ȫ�ֱ����������Ա����

    public void dfs(int s, int t) {
        found = false;
        boolean[] visited = new boolean[v];
        int[] prev = new int[v];
        for (int i = 0; i < v; ++i) {
            prev[i] = -1;
        }
        recurDfs(s, t, visited, prev);
        print(prev, s, t);
    }

    private void recurDfs(int w, int t, boolean[] visited, int[] prev) {
        if (found == true) return;
        visited[w] = true;
        if (w == t) {
            found = true;
            return;
        }
        for (int i = 0; i < adj[w].size(); ++i) {
            int q = adj[w].get(i);
            if (!visited[q]) {
                prev[q] = w;
                recurDfs(q, t, visited, prev);
            }
        }
    }

}
